import java.util.*;
public class Repitiions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int cnt=1;
        int maxCnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
                maxCnt=Math.max(cnt,maxCnt);
            } 
            else cnt=1;
        }

        System.out.println(maxCnt);
    }
}
