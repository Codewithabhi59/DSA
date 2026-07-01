import java.util.Scanner;

public class SearchPos {
    public int searchposition(int [] nums,int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                nums[i]=target;
                return i;
            }
            else if(nums[n-1]<target){
                return n;
            }
            }
            return -1;
        }
        public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter target value:");
        int val=sc.nextInt();

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        SearchPos solution=new SearchPos();
        int k=solution.searchposition(arr, val);
        System.out.println(k);

    }
}

