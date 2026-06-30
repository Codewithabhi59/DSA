import java.util.Scanner;
public class Removeelement {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value to be removed :");
        int val=sc.nextInt();

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Removeelement solution=new Removeelement();
        int k=solution.removeElement(arr,val);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}