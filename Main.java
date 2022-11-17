import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        if(n==1) System.out.println(1);
        else if(n==2 || n==3) System.out.println("NO SOLUTION");
        else{
            StringBuilder s=new StringBuilder();
            for(int i=2;i<=n;i+=2) s.append(i+" ");
            // System.out.println();
            for(int i=1;i<=n;i+=2) s.append(i+" ");
            System.out.println(s);
        }
    }
}
