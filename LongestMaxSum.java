import java.util.*;
public class LongestMaxSum{
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int x=sc.nextInt();
      int l=0,r=0,s=0,max=Integer.MIN_VALUE;
      while(r<n){
          while(s<x && r<n){
              s+=arr[r];
              r++;
          }
          if(s==x)
          max=Math.max(max,r-l);
          while(s>=x && l<n){
              s-=arr[l++];
          }
          if(s==x)
          max=Math.max(max,r-l);
      }
      System.out.println(max);
    }
}