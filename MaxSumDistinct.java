import java.util.*;
class MaxSumDistinct{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       HashSet<Integer> h=new HashSet<>();
       int sum=0,max=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
           h.add(arr[i]);
       }
       if(h.size()==k)
       max=sum;
       for(int i=k;i<n;i++){
           sum=sum-arr[i-k]+arr[i];
           h.remove(arr[i-k]);
           h.add(arr[i]);
           if(h.size()==k){
               max=Math.max(max,sum);
           }
       }
       System.out.println(max);
    }       
}