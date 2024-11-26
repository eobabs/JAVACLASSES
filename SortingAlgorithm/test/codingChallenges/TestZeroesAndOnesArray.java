package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestZeroesAndOnesArray {

    @Test
    public void turnToBinaryTest(){
        int [] numbers = {9,2,1,7,4};

        ZeroesAndOnesArray.turnToBinary(numbers);
        int [] expected = {1, 0, 1, 1, 0};
//        assertArrayEquals(expected,numbers);
        assertArrayEquals(expected,ZeroesAndOnesArray.turnToBinary(numbers));
    }
}
