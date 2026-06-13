import java.util.*;

public class Permutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find pivot
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: Find element just larger than pivot and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: Reverse the suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    } 
     //find the first adacent pair from right side where left is smaller than right
      //if you dont find such a pair, reverse the whole array
      //swap the left element in the pair with the smallest element greater than that to its right
      //then reverse the sub array from the point of swap(after the left element in the pair) till the end
}
