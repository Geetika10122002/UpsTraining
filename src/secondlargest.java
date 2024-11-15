import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        int max=list.get(list.size()-1);
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)!=max){
                System.out.print(list.get(i));
                break;
            }
        }
    }
}
