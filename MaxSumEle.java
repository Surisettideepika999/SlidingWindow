import java.util.*;
class MaxSumEle{
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
        int j=0,a=0,b=0;
        for(int i=k;i<n;i++){
            sum=sum-arr[j++]+arr[i];
            if(sum>max){
             max=sum; 
             a=j;b=i;
            }
        }
        for(int i=a;i<=b;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(max);
    }
}