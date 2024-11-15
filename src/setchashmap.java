import java.util.*;
public class setchashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>map1=new HashMap<Integer,String>();
        HashMap<Integer,String>map2=new HashMap<Integer,String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "D");
        map2.put(3, "C");
        compare(map1,map2);
    }
    public static void compare(Map<Integer,String>map1,Map<Integer,String>map2){
        for(Integer key:map1.keySet()){
            if(map2.containsKey(key)){
                if(!map1.get(key).equals(map2.get(key))){
                    System.out.print("Key " +key+" has different values: "+map1.get(key)+" vs "+map2.get(key));
                }
            }
        }
    }
}
