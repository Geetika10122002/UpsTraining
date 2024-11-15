import java.util.*;
public class arraylistproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String str[]=s.split(" ");
            ArrayList<Integer>list1=new ArrayList<>();
            for(int j=0;j<str.length;j++){
                list1.add(Integer.parseInt(str[j]));
            }
            list.add(list1);
        }
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            try{
                System.out.println(list.get(a-1).get(b));
            }
            catch(Exception e){
                System.out.println("Error!");
            }
        }
    }
}
