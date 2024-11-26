public class DoubleTheArray {

    public static int[] doubleArray(int[] numbers) {

        int [] result = new int[(numbers.length) * 2];

        for (int index = 0; index < numbers.length; index++) {
            result[index] = numbers[index];
        }
        int indexTwo = 0;
        for (int index = numbers.length; index < result.length; index++) {
            result[index] = numbers[indexTwo] * 2 ;
            indexTwo++;
        }
        return result;
    }
}
