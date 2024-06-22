import java.util.*;
public class MinLengthSubArray{
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int x=sc.nextInt();
      int l=0,r=0,s=0,min=Integer.MAX_VALUE;
      while(r<n){
          while(s<=x && r<n){
              s+=arr[r];
              r++;
          }
	min=Math.min(min,r-l+1);
          while(s>x && l<n){
              s-=arr[l++];
	      min=Math.min(min,r-l+1);
          }
      }
      System.out.println(min);
    }
}