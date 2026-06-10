import java.util.Scanner;
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansStart=0;
        int ansEnd=0;
        for(int i=0;i<nums.length;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(nums[i]+" ");

        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaximumSubArray obj = new MaximumSubArray();
        int ans=obj.maxSubArray(arr);
        System.out.println(ans);
    }
}

