import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)-list.get(i)!=1){
                System.out.print(list.get(i+1)-list.get(i));
            }
        }
    }
}
