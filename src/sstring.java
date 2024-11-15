import java.util.*;
public class sstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb.length());
        System.out.println(sb.indexOf("a"));
        StringBuilder sb1=new StringBuilder(sc.nextLine());
        String s1=sb.toString().concat(sb1.toString());
        System.out.println(s1);
        StringBuilder sb2=new StringBuilder(sc.nextLine());
        if(sb2.toString().equals(s1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(s1.charAt(0));
        System.out.println(sb2.toString().toUpperCase());
        System.out.print(sb1.toString().toLowerCase());
    }
}
