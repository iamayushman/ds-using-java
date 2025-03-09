import java.util.Arrays;

public class Array {
    // sort string array in java
    public static void main(String[] args) {
        String[] arr = { "ram", "ayu", "jay" };
        // using arrays
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(Arrays.toString(arr));

        // using loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
