import java.util.*;
public class Missing_Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int[] a=new int[n-1];
        int x;
        long sum=0;
        // for(int i=0;i<a.length;i++){
        //     a[i]=sc.nextInt();
        //     // sum+=a[i];
        // }
        // for(int i=0;i<a.length;i++){
        //     sum+=a[i];
        // }
        for(int i=0;i<n-1;i++){
            x=sc.nextInt();
            sum+=x;
        }
        
        long s=(n*(n+1))/2;
        System.out.println(s-sum);
        
    }    
}
