package chap01.practice01;

/**
 * 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
 * Created by KMS on 02/08/2020.
 */
public class Min4 {

    static int getMinValue(Integer min, Integer compareValue){
        // compareValue 가 더 작으면 1 이므로 0보다 크면 min 값에 compareValue를 대입
        if(min.compareTo(compareValue) > 0) min = compareValue;
        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        min = getMinValue(min, b);
        min = getMinValue(min, c);
        min = getMinValue(min, d);
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min4(4, 3, 2, 1) = "+ min4(4,3,2, 1));
        System.out.println("min4(4, 5, 6, 2) = "+ min4(4,5,6, 2));
        System.out.println("min4(4, 1, 5, 8) = "+ min4(4,1,5, 8));
    }
}
