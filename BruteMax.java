import java.util.*;
class BruteMax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0,max=0;
        for(int i=0;i<=n-k;i++){
            sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}