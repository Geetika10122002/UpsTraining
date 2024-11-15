import java.util.*;
public class lamba {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String>name=new ArrayList<>();
        name.add("lavanya");
        name.add("geetika");
        name.add("ravi");
        name.add("payoshnika");
        name.sort((a,b)->a.compareTo(b));
        for(String i:name){
            System.out.print(i+" ");
        }
    }
}
