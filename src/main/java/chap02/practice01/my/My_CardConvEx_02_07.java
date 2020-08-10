package chap02.practice01.my;

import java.util.Scanner;

/**
 * Created by KMS on 09/08/2020.
 */
public class My_CardConvEx_02_07 {

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int namugi = 0;
        do {
            System.out.printf(r+"|%5d",x);
            if(namugi !=0)
                System.out.print(" ・・・ "+ namugi);
            System.out.println("\n  +------");
            namugi = x % r;
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        System.out.printf("%8d",x);
        System.out.println(" ・・・ "+ namugi);
        reverse(d, digits);
        return digits;
    }

    static void swap(char[] d, int idx1, int idx2) {
        char t = d[idx1]; d[idx1]=d[idx2]; d[idx2]=t;
    }

    static void reverse(char[] d, int digits) {
        for (int i = 0; i < digits / 2;i++) {
            swap(d, i, digits - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 다시 한 번?
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열

        System.out.println("10진수를 기수로 변환합니다");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = stdIn.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for (int i = 0; i < dno; i++)
                System.out.print(cno[i]);
            System.out.println("입니다");

            System.out.println("한 번 더 할까요? (1.예/0.아니오):");
            retry = stdIn.nextInt();

        } while (retry == 1);
    }
}
