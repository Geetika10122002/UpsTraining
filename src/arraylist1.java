import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        list.add("Hello");
        list.add("Geetika");
        list.add("how");
        list.add("are");
        list.add("you");
        list.remove(0);
        list.remove("how");
        list.add(0,"Hello");
        list.set(0,"heyy");
        String s=list.get(1);
        System.out.println(s);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        boolean b=list.contains("heyy");
        int index=list.indexOf("Geetika");
        System.out.print(index);
    }
}
