import java.util.*;
public class interator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        list.add("Lavanya");
        list.add("Geetika");
        list.add("Priya");
        Iterator<String>itr=list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
