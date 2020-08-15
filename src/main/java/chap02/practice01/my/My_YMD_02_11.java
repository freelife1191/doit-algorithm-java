package chap02.practice01.my;

import java.time.LocalDate;
import java.util.Date;

/**
 * 서기 년월일을 필드로 갖는 클래스를 만들어라
 * 생성자(contructor)와 메서드를 정의해야 한다
 *
 * Created by KMS on 15/08/2020.
 */
public class My_YMD_02_11 {

    int y; //년
    int m; //월(1 ~ 12)
    int d; //일(1 ~ 31)

    /**
     * 생성자(주어진 날짜로 설정)
     * @param y
     * @param m
     * @param d
     */
    public My_YMD_02_11(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    /**
     * n일 뒤의 날짜를 반환
     * @return
     */
    public LocalDate after() {
        return LocalDate.of(this.y, this.m, this.d).plusDays(1);
    }

    /**
     * n일 앞의 날짜를 반환
     * @return
     */
    public LocalDate before() {
        return LocalDate.of(this.y, this.m, this.d).minusDays(1);
    }

    public static void main(String[] args) {
        My_YMD_02_11 ymd = new My_YMD_02_11(2020, 1, 3);
        System.out.println(ymd.after());
        System.out.println(ymd.before());
    }
}
