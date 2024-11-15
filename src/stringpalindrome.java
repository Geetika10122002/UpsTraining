import java.util.*;
public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(ispalindrome(s,0,s.length()-1)){
            System.out.print("Yes it is plaindrome");
        }
        else{
            System.out.print("No it is not palnidrome");
        }
    }
    public static boolean ispalindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return ispalindrome(s,start+1,end-1);
    }
}
