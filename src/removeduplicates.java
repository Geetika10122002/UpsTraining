import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
    }
}
