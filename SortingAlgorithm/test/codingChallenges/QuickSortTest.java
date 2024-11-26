package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void quickSortTest(){

        int [] numbers = {9,2,1,7,4};
        int start = 0;
        int end = numbers.length - 1;

        QuickSort.sort(numbers, start, end);

        int [] expected = {1,2,4,7,9};
        assertArrayEquals(expected, numbers);

    }
    @Test
    public void MaximumProduct(){
        int [] numbers = {9,2,1,7,4};
        int [] result;
        int [] expected;
        result = QuickSort.findMaximumProduct(numbers);
        expected = new int[]{7, 9};
        assertArrayEquals(expected, result);
    }
}
