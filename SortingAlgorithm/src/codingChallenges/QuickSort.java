package codingChallenges;

public class QuickSort {

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

    public static int[] findMaximumProduct(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
        int lowest = numbers[0];
        int secondLowest = numbers[1];
        int secondHighest = numbers[numbers.length - 2];
        int highest = numbers[numbers.length - 1];
        int firstProduct = lowest * secondLowest;
        int secondProduct = highest * secondHighest;

        if (firstProduct > secondProduct) {
            return new int[] {lowest, secondLowest};
        }
        return new int[] {secondHighest, highest};
    }
}
