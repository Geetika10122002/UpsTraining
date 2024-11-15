import java.util.*;
public class removeleadingzeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
                index=i;
                break;
            }
        }
        ans=s.substring(index,s.length());
        System.out.print(ans);
    }
}
