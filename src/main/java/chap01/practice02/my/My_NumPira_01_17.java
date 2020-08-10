package chap01.practice02.my;

/**
 * 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성
 * Created by KMS on 02/08/2020.
 */
public class My_NumPira_01_17 {

    /**
     * 아래를 향한 n단의 숫자 피라미드를 출력
     * i행에 출력하는 숫자는 i % 10 으로 구함
     * @param n
     */
    static void npira(int n) {
        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print(i % 10);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(n+"단의 피라미드를 출력");
        npira(n);
    }
}
