import java.util.*;
class CircularWindow{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0,max=0;
        for(int i=0;i<k;i++){
                sum=sum+arr[i];
        }
        int j=n-k+1,l=0;
        for(int i=1;i<n;i++){
            if(i<=n-k){
            sum=sum-arr[i-1]+arr[i+k-1];
            }
            else{
                // sum=sum-arr[i-1]+arr[n-(j--)-(k-1)];
                sum=sum-arr[i-1]+arr[l++];
            }
             if(sum>max){
             max=sum; 
            }
        }
        System.out.println(max);
    }
}