package chap01.practice01;

/**
 * Created by KMS on 02/08/2020.
 */
public class Min3 {

    static int getMinValue(Integer min, Integer compareValue){
        // compareValue 가 더 작으면 1 이므로 0보다 크면 min 값에 compareValue를 대입
        if(min.compareTo(compareValue) > 0) min = compareValue;
        return min;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        min = getMinValue(min, b);
        min = getMinValue(min, c);
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min3(4, 3, 2) = "+ min3(4,3,2));
        System.out.println("min3(4, 5, 6) = "+ min3(4,5,6));
        System.out.println("min3(4, 1, 5) = "+ min3(4,1,5));
    }
}
