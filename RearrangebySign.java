import java.util.Arrays;
import java.util.Scanner;
public class RearrangebySign {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                arr[posIndex]=nums[i];
                posIndex+=2;
            }
        }        
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         RearrangebySign obj = new RearrangebySign();
         int[] ans=obj.rearrangeArray(arr);
         System.out.println(Arrays.toString(ans));
    }
}
