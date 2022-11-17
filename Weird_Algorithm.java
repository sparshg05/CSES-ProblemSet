import java.util.*;
public class Weird_Algorithm {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        while(true){
            System.out.print(n+" ");
            if(n==1) break;
            if((n&1)==0) n/=2;
            else{
                n=n*3 + 1;
            }
            
        }
    }
}
