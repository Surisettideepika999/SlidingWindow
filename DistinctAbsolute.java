import java.util.*;
public class DistinctAbsolute{
    static public int distinct(int[] arr,int n){
        	int l=0,r=n-1,ans=n;
        while(l<r){
            while(l<r && arr[l]==arr[l+1]){
                l++;ans--;
            }
            while(r>l && arr[r]==arr[r-1]){
                r--;ans--;
            }
            if(l<r){
                int sum=arr[l]+arr[r];
            if(sum==0){
                l++;r--;ans--;
            }
            else if(sum>0)
            r--;
            else l++;
        }
        }
        return ans;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
          System.out.print(distinct(arr,n));
    }
}