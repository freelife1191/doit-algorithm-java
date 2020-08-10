package chap01.practice02.my;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Created by KMS on 02/08/2020.
 */
public class My_DigitsNo_01_11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        do {
            System.out.println("양의 정수를 입력하세요: ");
            num = stdIn.nextInt();
            if( num <= 0 ) System.out.println("0 보다 큰 양의 정수를 입력하세요!");
        } while (num <= 0);

        System.out.println("그 수는 "+String.valueOf(num).length()+"자리입니다");
    }
}