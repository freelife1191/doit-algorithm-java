package chap01.practice02.my;

/**
 * 정수a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다
 * Created by KMS on 02/08/2020.
 */
public class SumOfGauss_01_09 {

    static int sumof(int a, int b) {
        int min; // a, b의 작은 쪽의 값
        int max; // a, b의 큰 쪽의 값
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        // 항의 갯수 끝항에서 첫항의 -1 만큼 빼면 총 항의 갯수임
        int start = max - ( min - 1 );
        // 가우스 공식을 사용해 모든 정수의 합을 구함
        return (start * ( min + max )) / 2;
        // return (start * ( (2 * a) + (start - 1) * 1)) / 2;
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        System.out.println(a +"부터 "+b+" 사이의 모든 정수의 합 = "+sumof(a, b));
    }
}
