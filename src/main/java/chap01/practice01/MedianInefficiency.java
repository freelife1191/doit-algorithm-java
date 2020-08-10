package chap01.practice01;

import java.util.Scanner;

/**
 * 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력합니다
 * Created by KMS on 02/08/2020.
 */
public class MedianInefficiency {

    /**
        연습1-5 해답
        가장 처음의 if문의 판단
        if ((b >= a && c<= a) || (b <= a && c >= a))
        에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
        else if ((a > b && c < b) || (b <= a && c > b))
        으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.
    **/
    public static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을구합니다.");
        System.out.print("a의 값：");
        int a = stdIn.nextInt();
        System.out.print("b의 값：");
        int b = stdIn.nextInt();
        System.out.print("c의 값：");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
