package chap01.practice02;

import java.util.Scanner;

/**
 * 가우스 공식에 의해 1, 2, …, n의 합을 구합니다.
 * Created by KMS on 02/08/2020.
 */
public class SumGauss_01_08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값：");
        int n = stdIn.nextInt();

        /*
        System.out.println("첫째: ("+n+" + 1) = "+(n+1));
        System.out.println("두째: ("+n+" / 2) = "+(n/2));
        System.out.println("첫째 둘째의 곱: ("+(n+1)+") * ("+(n/2)+") = "+(n+1)*(n/2));
        if(n % 2 == 0)
            System.out.println("짝수: ("+n+" % 2) = 짝수이면 "+(n%2));
        if(n % 2 == 1)
            System.out.println("홀수: ("+n+" % 2) = 1 (홀수) 이면 ("+n+" + 1) / 2 공식을 대입 더해야되는 값 = "+(n + 1) / 2);
        System.out.println("짝수 홀수 판단: ("+n+" % 2 == 1 ? ("+n+" + 1) / 2 : 0) = "+(n % 2 == 1 ? (n + 1) / 2 : 0));

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
        System.out.println("공식 출력 : ("+(n+1)+") * ("+(n/2)+") + "+(n % 2 == 1 ? (n + 1) / 2 : 0)+" = "+sum);
        */

        //http://www.ebsi.co.kr/ebs/lms/lmsx/retrieveSbjtDtl.ebs?sbjtId=S20180001037
        // 등차수열의 합 공식 공차가 주어질 때 사용
        // int sum = (n * ((2*1) + (n - 1))) / 2;
        // 첫항과 끝항을 알때의 가우스 공식
        int sum = (n  * ( 1 + n )) / 2 ;
        System.out.println("가우스 공식 출력 : ( "+n+" * ( 1 + "+n+" )) / 2 = "+sum);

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}