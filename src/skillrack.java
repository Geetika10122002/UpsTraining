import java.util.*;
public class skillrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='*'){
                int num=Integer.parseInt(s.substring(i,i+2));
                System.out.print(alpha.charAt(num));
                i+=2;
            }
            else{
                int num=Integer.parseInt(String.valueOf(s.charAt(i)));
                System.out.print(alpha.charAt(num));
            }
        }
    }
}
