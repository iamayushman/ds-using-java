import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class ArrayOperations {

    public static void main(String[] args) {
        // create array
        int[] arr = new int[10];
        arr = fillWithValue(arr);
        print("fill with default value");
        print(arr);
        print("fill with value");
        arr = fillWithValue(arr, 100);
        print(arr);
        print("fill with increasing value");
        arr = fillWithIncreasingValue(arr, 100);
        print(arr);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static int[] fillWithValue(int[] arr) {
        return fillWithValue(arr, 5);
    }

    public static int[] fillWithValue(int[] arr, int defaultNumber) {
        // fill with a number
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = defaultNumber;
        // }
        // return arr;

        Arrays.fill(arr, defaultNumber);
        return arr;
    }

    public static int[] fillWithIncreasingValue(int[] arr, int defaultNumber) {
        // fill with a number
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = defaultNumber + i;
        // }
        // return arr;

        Arrays.setAll(arr, i -> i + defaultNumber);
        return arr;
    }

}
