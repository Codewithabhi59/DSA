import java.util.Scanner;
public class Squaresort {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] newarr=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            int leftsq=nums[i] * nums[i];
            int rightsq=nums[j] * nums[j];
            if(leftsq>rightsq){
                newarr[k--]=leftsq;
                i++;
            }
            else{
                newarr[k--]=rightsq;
                j--;
            }
        }
        return newarr;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Squaresort solution=new Squaresort();
        int[] k=solution.sortedSquares(arr);
        for(int i=0;i<n;i++){
            System.out.print(k[i]+" ");
        }
    }
}
//you can also check in array is if it's full of negatives or full of positives or both partially to ease up calculation
