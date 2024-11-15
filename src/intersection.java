import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            list2.add(sc.nextInt());
        }
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                list3.add(list1.get(i));
            }
        }
        for(int num:list3){
            System.out.print(num+" ");
        }

    }
}
