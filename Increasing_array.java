import java.util.*;
public class Increasing_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        long cnt=0;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                long d=(a[i-1]-a[i]);
                cnt+=d;
                a[i]+=d;
            }
        }

        System.out.print(cnt);
    }
}
