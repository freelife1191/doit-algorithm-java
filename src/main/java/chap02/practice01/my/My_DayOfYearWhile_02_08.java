package chap02.practice01.my;

import java.util.Random;

/**
 * Created by KMS on 12/08/2020.
 */
public class My_DayOfYearWhile_02_08 {

    // 각 달의 일수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //윤년
    };

    // 서기 year년은 윤년인가? (윤년：1／평년：0)
    static int isLeap(int year) {
        return (year % 4 ==0 && // 4로 나누어 떨어지는 해를 윤년
                year % 100 != 0 || year % 400 == 0 // 100으로 나누어 떨어지지않거나 400으로 나누어 떨어지는 해를 윤년
        ) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        while (m > 1) { //1월~(m-1)월의 일 수를 더함 원래 일수에 계산된 일수를 while 문을 돌면서 더함
            d += mdays[isLeap(y)][(m--) - 1];// 윤년이면 1, 평년이면 0

        }
        return d;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println("그 해 경과 일수를 구합니다");

        int year = 2020;
        // int month = 1 + rand.nextInt(11);
        // int day = 1 + rand.nextInt(27);
        int month = 8;
        int day = 26;

        System.out.printf("%d년 %d월 %d일%n",year, month, day);

        System.out.printf("그 해 %d일째입니다.\n",dayOfYear(year, month, day));

    }
}
