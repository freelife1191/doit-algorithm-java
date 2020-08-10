package chap01.practice02.my;

import java.util.Scanner;

/**
 * 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요
 * Created by KMS on 02/08/2020.
 */
public class My_Square_01_14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정사각형을 출력합니다");
        System.out.print("단 수: ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
