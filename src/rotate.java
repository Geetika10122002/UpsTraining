import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(17);
        list.add(19);
        list.add(22);
        list.add(28);
        list.add(31);
        list.add(35);
        int n=sc.nextInt();
        ArrayList<Integer>list1=new ArrayList<Integer>();
        for(int i=n+1;i<list.size();i++){
            list1.add(list.get(i));
        }
        for(int i=0;i<=n;i++){
            list1.add(list.get(i));
        }
        for(int i:list1){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
