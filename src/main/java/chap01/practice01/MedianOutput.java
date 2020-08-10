package chap01.practice01;

import chap01.exam01.Median;

/**
 * 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요
 * Created by KMS on 02/08/2020.
 */
public class MedianOutput {
    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + Median.med3(3, 2, 1));		// [A] a＞b＞c
        System.out.println("max3(3,2,2) = " + Median.med3(3, 2, 2));		// [B] a＞b＝c
        System.out.println("max3(3,1,2) = " + Median.med3(3, 1, 2));		// [C] a＞c＞b
        System.out.println("max3(3,2,3) = " + Median.med3(3, 2, 3));		// [D] a＝c＞b
        System.out.println("max3(2,1,3) = " + Median.med3(2, 1, 3));		// [E] c＞a＞b
        System.out.println("max3(3,3,2) = " + Median.med3(3, 3, 2));		// [F] a＝b＞c
        System.out.println("max3(3,3,3) = " + Median.med3(3, 3, 3));		// [G] a＝b＝c
        System.out.println("max3(2,2,3) = " + Median.med3(2, 2, 3));		// [H] c＞a＝b
        System.out.println("max3(2,3,1) = " + Median.med3(2, 3, 1));		// [I] b＞a＞c
        System.out.println("max3(2,3,2) = " + Median.med3(2, 3, 2));		// [J] b＞a＝c
        System.out.println("max3(1,3,2) = " + Median.med3(1, 3, 2));		// [K] b＞c＞a
        System.out.println("max3(2,3,3) = " + Median.med3(2, 3, 3));		// [L] b＝c＞a
        System.out.println("max3(1,2,3) = " + Median.med3(1, 2, 3));		// [M] c＞b＞a
    }
}
