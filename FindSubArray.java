import java.util.*;
public class FindSubArray{
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int x=sc.nextInt();
      int f=0;
      HashMap<Integer,Integer> h=new HashMap<>();
      int s=0,e=-1,csum=0;
      for(int i=0;i<n;i++){
          csum+=arr[i];
          if(h.containsKey(csum-x)){
              System.out.println(h.get(csum-x)+1+" "+i);
              f=1;
              break;
          }
          else if(csum-x==0)
         {
             System.out.println(0+" "+i);
             f=1;
              break;
         }
         h.put(csum,i);
      }
      if(f==0)
      System.out.println("no");
    }
}