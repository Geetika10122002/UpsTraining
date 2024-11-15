import java.util.*;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(15);
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        long count =list.stream().count();
        System.out.println(count);
        List<Integer>flist=list.stream().filter(i -> i>5).collect(Collectors.toList());
        System.out.println("Elements greater than 5: "+flist);

    }
}
