import java.util.*;
class DistinctBrute{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       ArrayList<Integer> a=new ArrayList<>();
       for(int i=0;i<=n-k;i++){
           HashSet<Integer> h=new HashSet<>();
           for(int j=i;j<i+k;j++){
               h.add(arr[j]);
           }
           a.add(h.size());
        }
        for(Integer x:a)
        System.out.println(x);
    }
}