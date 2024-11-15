import java.util.*;
public class foreach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String vow="aeiouAEIOU";
        int count=0;
        for(char ch:s.toCharArray()){
            if(vow.contains(String.valueOf(ch))){
                count++;
            }
        }
        System.out.print(count);
    }
}
