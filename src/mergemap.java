import java.util.*;
public class mergemap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>map1=new HashMap<>();
        HashMap<Integer,String>map2=new HashMap<>();
        map1.put(1,"geetika");
        map1.put(2,"lavanya");
        map2.put(1,"priya");
        map2.put(3,"tharmesh");
        map1.putAll(map2);
        for(Map.Entry<Integer,String>i:map1.entrySet()){
            System.out.print(i.getKey()+" "+i.getValue());
            System.out.println();
        }
    }
}
