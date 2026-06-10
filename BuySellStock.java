import java.util.Scanner;
public class BuySellStock {
    public int buystocksell(int[] prices) {
        int mini=prices[0];
        int profit=0;
        int cost=0;
        for(int i=1;i<prices.length;i++){
            cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BuySellStock obj = new BuySellStock();
        int ans=obj.buystocksell(arr);
        System.out.println(ans);
    }
}