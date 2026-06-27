import java.util.Scanner;
public class Removeduplicates {
    public int RemoveDuplicate(int[] nums){
        int i=0;
        int uniques=1;
        int j=1;
        while(j<nums.length){
            if(nums[j]==nums[i]){
                j++;
            }
            else{
            nums[i+1]=nums[j];
            i++;
            uniques++;
            j++;
            }
        }    
        return uniques;    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Removeduplicates solution=new Removeduplicates();
        int k=solution.RemoveDuplicate(arr);
        System.out.println("No. of unique elements in array "+ k);

        //printing the unique elements array 
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
