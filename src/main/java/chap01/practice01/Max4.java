package chap01.practice01;

import org.w3c.dom.ls.LSOutput;

/**
 * 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
 * Created by KMS on 02/08/2020.
 */
public class Max4 {

    static int getMaxValue(Integer max, Integer compareValue){
        // compareValue 가 더 크면 -1 이므로 0보다 작으면 max 값에 compareValue를 대입
        if(max.compareTo(compareValue) < 0) max = compareValue;
        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        max = getMaxValue(max, b);
        max = getMaxValue(max, c);
        max = getMaxValue(max, d);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4(4, 3, 2, 1) = "+max4(4,3,2,1));
        System.out.println("max4(4, 5, 6, 7) = "+max4(4,5,6,7));
        System.out.println("max4(4, 3, 4, 8) = "+max4(4,3,5,8));
    }
}
