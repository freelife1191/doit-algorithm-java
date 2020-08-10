package chap01.practice02.my;

import javax.swing.*;

/**
 * Created by KMS on 02/08/2020.
 */
public class My_Triangle_01_15 {

    /**
     * 왼쪽 아래가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * 왼쪽 위가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleLU(int n) {
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * 오른쪽 위가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleRU(int n) {
        for (int i = n; i >= 1; i--){
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * 오른쪽 아래가 직각인 이등변 삼각형을 출력
     * @param n
     */
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
        triangleLB(n);
        System.out.println();

        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
        triangleLU(n);
        System.out.println();

        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
        triangleRU(n);
        System.out.println();

        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
        triangleRB(n);
        System.out.println();
    }
}
