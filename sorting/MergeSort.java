import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = new int[] { 5, 1, 6, 82, 1, 8, 100, -1 };
        System.out.println("Before:");
        System.out.println(Arrays.toString(nums));
        System.out.println("After:");
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void mergeSort(int[] nums) {

        // devide
        int numsLenght = nums.length;
        int midIndex = numsLenght / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[numsLenght - midIndex];

        if (numsLenght < 2) {
            return;
        }

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = nums[i];
        }
        for (int i = midIndex; i < numsLenght; i++) {
            rightHalf[i - midIndex] = nums[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        // concure
        merge(nums, leftHalf, rightHalf);

    }

    static void merge(int[] nums, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                nums[k] = leftHalf[i];
                i++;
            } else {
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            nums[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            nums[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
