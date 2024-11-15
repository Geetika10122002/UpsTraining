import java.util.*;
public class stringlexographical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int a=s1.compareTo(s2);
        if(a>0){
            System.out.print("String1 is first");
        }
        else if(a==0){
            System.out.print("Both strings are equal");
        }
        else{
            System.out.print("String2 is first");
        }
    }
}
