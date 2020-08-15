package chap02.practice01;

import java.util.Scanner;

/**
 * 날짜 클래스
 * Created by KMS on 15/08/2020.
 */
public class YMD_02_11 {
    int y; // 서기 년
    int m; // 월(1~12)
    int d; // 일(1~31)

    // 각 달의 일수
    static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
    };

    // 서기 year년은 윤년인가? (윤년：1／평년：0)
    static int isLeap(int year) {
        return (year % 4 ==0 && // 4로 나누어 떨어지는 해를 윤년
                year % 100 != 0 || year % 400 == 0 // 100으로 나누어 떨어지지않거나 400으로 나누어 떨어지는 해를 윤년
        ) ? 1 : 0;
    }

    // 생성자(주어진 날짜로 설정)
    YMD_02_11(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // n일 뒤의 날짜를 반환
    YMD_02_11 after(int n) {
        YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);
        if (n < 0) //n이 0보다 작으면 before 함수를 호출한다
            return (before(-n));

        temp.d += n;

        while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) { //더한 날짜가 현재 년 월의 일수보다 많으면 루프문 수행
            temp.d -= mdays[isLeap(temp.y)][temp.m - 1]; // 현재 일자에 현재 년월의 일수를 뺀다
            if (++temp.m > 12) { // 더한 월이 12월보다 크면
                temp.y++; // 년을 증가 시키고
                temp.m = 1; // 월을 1월로 설정한다
            }
        }
        return temp;
    }

    // n일 앞의 날짜를 반환
    YMD_02_11 before(int n) {
        YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);
        if (n < 0) //n이 0보다 작으면 after 함수를 호출한다
            return (after(-n));

        temp.d -= n;

        while (temp.d < 1) { // 일자가 1일 보다 작으면 반복문 수행
            if (--temp.m < 1) { // 월을 마이너스하는데 월이 1월 보다 작으면
                temp.y--; // 년을 1년 마이너스 하고
                temp.m = 12; // 월을 12월로 적용함
            }
            temp.d += mdays[isLeap(temp.y)][temp.m - 1]; //현재 년월의 날짜를 더하면 이전 날짜가 됨
            // 일자가 1일을 넘어서면 루프문 종료
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("날짜를 입력하세요.\n");
        System.out.print("년：");
        int y = stdIn.nextInt();
        System.out.print("월：");
        int m = stdIn.nextInt();
        System.out.print("일：");
        int d = stdIn.nextInt();
        YMD_02_11 date = new YMD_02_11(y, m, d);

        System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
        int n = stdIn.nextInt();

        YMD_02_11 d1 = date.after(n);
        System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

        YMD_02_11 d2 = date.before(n);
        System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
    }
}
