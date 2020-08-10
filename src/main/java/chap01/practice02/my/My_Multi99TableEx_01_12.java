package chap01.practice02.my;

/**
 * 오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성
 * 구분선은 수직선 기호(|), 플러스 기호(+)를 사용하세요
 * Created by KMS on 02/08/2020.
 */
public class My_Multi99TableEx_01_12 {

    public static void main(String[] args) {
        System.out.println("------------ 곱셈표 -----------");
        System.out.printf("%4s", "|");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |",i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i * j);
            System.out.println();
        }
    }
}
