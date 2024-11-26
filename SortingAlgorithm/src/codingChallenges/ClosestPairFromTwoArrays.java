package codingChallenges;

public class ClosestPairFromTwoArrays {

    public static void main(String[] args) {

        int [] arrayOne = {7, 1, 5, 4};
        int [] arrayTwo = {30, 40, 10, 20};
        int target = 2;

        int [] result = getResult(arrayOne, arrayTwo, target);

        if (result == null)
            System.out.print("not available");
        else {
            for (int element : result)
                System.out.print(element + " ");
        }
    }
    public static int[] sort(int[] numbers, int start, int end) {
        if (start < end) {
            int indexOfPartition = partition(numbers, start, end);
            sort(numbers, start, indexOfPartition - 1);
            sort(numbers, indexOfPartition + 1, end);
        }
        return numbers;
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int currentIndex = start;
        for (int index = start; index < end; index++) {
            if (numbers[index] < pivot){
                swap(numbers, currentIndex, index);
                currentIndex++;
            }
        }
        swap(numbers, currentIndex, end);
        return currentIndex;
    }

    private static void swap(int[] numbers, int currentIndex, int index) {
        int temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[index];
        numbers[index] = temp;
    }

    public static int[] getResult(int[] numbers, int [] numbers2, int key) {
        int [] checkOne = sort(numbers, 0, numbers.length - 1);
        int [] checkTwo = sort(numbers2, 0, numbers2.length - 1);

        int lengthOne = checkOne.length;
        int lengthTwo = checkTwo.length;
        int[] resultArray = new int[2];
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                int result = checkOne[i] + checkTwo[j] - key;
                if (result < 0)  {
                    result = result * -1;
                    if (result < smallest) {
                        smallest = result;
                        resultArray[0] = checkOne[i];
                        resultArray[1] = checkTwo[j];
                    }
                }
                else {
                    return resultArray;
                }

            }
        }
            return resultArray;
    }
}
