import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(reverse(s));
    }
    public static String reverse(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
}
