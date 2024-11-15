import java.util.*;
public class reverselist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.reverse(list);
        for(int num:list){
            System.out.print(num+" ");
        }

    }
}
