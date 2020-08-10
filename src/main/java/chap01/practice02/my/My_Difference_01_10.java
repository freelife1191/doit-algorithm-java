package chap01.practice02.my;

import java.util.Scanner;

/**
 * Created by KMS on 02/08/2020.
 */
public class My_Difference_01_10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("a의 값: ");
        int a = stdIn.nextInt();
        int b;
        do {
            System.out.println("b의 값: ");
            b = stdIn.nextInt();
            if( b <= a ) System.out.println("a 보다 큰 값을 입력하세요!");
        } while ( b <= a );

        System.out.println("b - a는 "+(b-a)+"입니다");
    }
}