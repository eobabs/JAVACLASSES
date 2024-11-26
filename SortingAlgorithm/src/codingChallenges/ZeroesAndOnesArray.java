package codingChallenges;

import java.util.Arrays;

public class ZeroesAndOnesArray {


    public static int[] turnToBinary(int[] numbers) {
        return Arrays.stream(numbers).map(x->x%2).toArray();
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                numbers[i] = 0;
//            }
//            else{
//                numbers[i] = 1;
//            }
//        }
//        return numbers;
    }
}
