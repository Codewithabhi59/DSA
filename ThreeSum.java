import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // we are implementing 2sum here so we always need to implement sorting first otherwise answer will be different 
        int n=nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            int sum = -1*nums[i];
            while(left<right){
                int s=nums[left]+nums[right];
                if(s==sum){
                    //List<Integer> triplet = new ArrayList<>();
                    //triplet.add(nums[i]);
                    //triplet.add(left);
                    //triplet.add(right);
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                while(left<n && nums[left]==nums[left-1]){
                    left++;
                }
                while(right>=0 && nums[right]==nums[right+1]){
                    right--;
                }
                }
                else if(s<sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
    
    return result;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
    }

    ThreeSum sol = new ThreeSum();
    List<List<Integer>> result = sol.threeSum(nums);

    System.out.println("Triplets:");
    for (List<Integer> triplet : result) {
        System.out.println(triplet);
    }

    sc.close();
}
}