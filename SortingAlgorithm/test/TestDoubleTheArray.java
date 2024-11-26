import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TestDoubleTheArray {


    @Test
    public void testDoubleTheArray() {
        int [] numbers = {2,5,7};
        int [] result = DoubleTheArray.doubleArray(numbers);
        int [] expected = {2,5,7,4,10,14};
        assertArrayEquals(expected,result);
    }
}
