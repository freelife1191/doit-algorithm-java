package chap03.practice;

import java.util.Scanner;

/**
 * 이진검색 (같은 맨 앞 요소를 찾습니다)
 * Created by KMS on 30/08/2020.
 */
public class BinSearchX_03_05 {
    /**
     * 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 이진검색
     * @param a
     * @param n
     * @param key
     * @return
     */
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0; // 검색범위 맨 앞의 index
        int pr = n - 1; // 검색범위 맨 뒤의 index

        do {
            int pc = (pl + pr) / 2; // 중앙요소의 index
            if (a[pc] == key) { // 중앙값과 key값이 같으면
                for (; pc > pl; pc--) { // 중앙값을 1씩 빼면서 중복된 key 값의 맨 앞의 요소를 찾는다
                    System.out.println("pc = "+pc+", key = "+key+", a["+pc+"-1] = "+a[pc-1]);
                    if (a[pc - 1] < key) { // 맨 앞의 요소의 그 앞의 요소가 key 보다 작으면 반복값이 끝난 것으로 판단
                        break; // break 하고 현재의 pc를 리턴
                    }
                }
                return pc; // 검색성공
            } else if (a[pc] < key)
                pl = pc + 1; // 검색범위를 앞쪽 절반으로 좁힘
            else
                pr = pc - 1; // 검색범위를 뒤쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1; // 검색실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int key = stdIn.nextInt();

        int idx = binSearchX(x, num, key); // 배열 x에서 값이 key인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key + "은 x[" + idx + "]에 있습니다.");
    }
}
