package chap01.practice02.my;

/**
 * n단의 피라미드를 출력하는 메서드를 작성하세요
 * Created by KMS on 02/08/2020.
 */
public class My_StarPira_01_16 {

    /**
     * n단의 피라미드를 출력
     * i행에는 (i-1)*2+1개의 기호 문자 *가 출력 되게함
     * 마지막 n행에는 (n-1)*2+1개의 기호 문자 *를 출력하게 됨
     * @param n
     */
    static void spira(int n) {
        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= n-i; k++)
                System.out.print(" ");
            for (int j = 1; j <= (i - 1) * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n+"단의 피라미드를 출력");
        spira(n);
    }
}
