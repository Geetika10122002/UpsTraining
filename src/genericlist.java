import java.util.*;
public class genericlist {
    public static <T extends Number> int even(List<T> list){
        int sum=0;
        for(int i=0;i<list.size();i++){
             if(list.get(i).intValue()%2==0){
                 sum+=list.get(i).intValue();
             }
        }
        return sum;
    }
    public static <T extends Number>int odd(List<T>list){
        int sum1=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).intValue()%2!=0){
                sum1+=list.get(i).intValue();
            }
        }
        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(even(list));
        System.out.print(odd(list));
    }
}
