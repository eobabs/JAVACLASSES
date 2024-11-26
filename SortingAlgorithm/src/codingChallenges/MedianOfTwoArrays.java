package codingChallenges;

public class MedianOfTwoArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums3 = new int [nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++)
            nums3[i] = nums1[i];
        int index = 0;
        for (int i = nums1.length; i < nums3.length; i++){
            nums3[i] = nums2[index];
            index++;
        }
        nums3 = sort(nums3, 0, nums3.length - 1);

        double median = 1;
        if (nums3.length % 2 == 0){
            int med1 = nums3[nums3.length/2];
            int med2 = nums3[nums3.length/2 - 1];

            median = (med1 + med2)/ 2.0;
        }
        else {
            median = nums3[nums3.length/2] * 1.0;
        }
        return median;
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

    public static void main(String... args){
        int [] numberArray = {1,2,5,4,3};
        int [] numberList = {6,7,8,9};

        double result = findMedianSortedArrays(numberArray, numberList);
        System.out.print(result);
    }

}
