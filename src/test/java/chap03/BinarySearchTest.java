package chap03;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by KMS on 02/09/2020.
 */
class BinarySearchTest {

    @Test
    void ArraysBinarySearchTest() {
        Object[] intArray =  Lists.newArrayList(1, 2, 3, 5, 7, 9).toArray();
        System.out.println(Arrays.binarySearch(intArray, 8));
    }


}
