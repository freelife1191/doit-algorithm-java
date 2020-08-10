package chap02.practice01.my;

import java.util.Random;
import java.util.Scanner;

/**
 * 베열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요
 * Created by KMS on 08/08/2020.
 */
public class My_Copy_02_04 {
    // 배열 b의 모든 요소를 배열 a에 복사
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[i];
            System.out.print("a["+i+"] : "+a[i]);
            if (i != num-1 )
                System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int nb = 5 + rand.nextInt(5);
        System.out.println("배열 b의 요솟수: "+nb); // 배열 a의 요솟수

        int[] b = new int[nb]; // 요솟수가 na인 배열

        for (int i = 0; i < nb; i++) {
            b[i] = rand.nextInt(100);
            System.out.print("b["+i+"] : "+b[i]);
            if (i != nb-1 )
                System.out.print(", ");
        }
        System.out.println();

        int na = 5 + rand.nextInt(5);
        System.out.println("배열 a의 요솟수: "+na);

        int[] a = new int[na]; // 요솟수가 na인 배열

        for (int i = 0; i < na; i++) {
            a[i] = rand.nextInt(100);
            System.out.print("a["+i+"] : "+a[i]);
            if (i != na-1 )
                System.out.print(", ");
        }
        System.out.println();
        copy(a, b);

    }
}
