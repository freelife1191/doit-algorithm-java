package chap02.practice01.my;

import java.util.Random;

/**
 * 배열 요솟값을 읽어 들여 역순으로 정렬
 * Created by KMS on 04/08/2020.
 */
public class My_ReverseArrayEx_02_02 {
    // 배열의 요소 a[idx1]와 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소 값을 나타냄
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // 배열 a의 요소 값을 나타냄
    static void reverse(int[] a) {
        print(a);
        for(int i=0; i< a.length/2; i++){
            System.out.println("a["+i+"]과 a["+(a.length - i - 1)+"]를 교환합니다");
            swap(a, i, a.length - i - 1);
            print(a);
        }
    }

    // 배열 a의 요소를 역순으로 정렬
    public static void main(String[] args) {
        Random rand = new Random();
        int num = 5 + rand.nextInt(5);
        System.out.println("요솟수: "+num);  // 요솟수

        int[] x = new int[num]; // 요솟수 num인 배열

        for (int i=0;i<num;i++) {
            x[i] = -50 + rand.nextInt(100);
        }

        reverse(x); // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");

    }
}
