// add all element except for itself

public class Dp2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };
        int[] ans = productOfAllElementExceptItself(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    static int[] productOfAllElementExceptItself(int[] nums) {
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[right.length - 1] = 1;
        for (int i = right.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
