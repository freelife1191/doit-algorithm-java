package chap01.practice02.my;

/**
 * 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성
 * 12번과 같이 표의 위쪽과 왼쪽에 더하는 수를 출력
 * Created by KMS on 02/08/2020.
 */
public class My_Add99TableEx_01_13 {
    public static void main(String[] args) {
        System.out.println("------------ 덧셈표 -----------");
        System.out.printf("%4s", "|");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%3d", i);
        System.out.println("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |",i);
            for (int j = 1; j <= 9; j++)
                System.out.printf("%3d", i + j);
            System.out.println();
        }
    }
}
