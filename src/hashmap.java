import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            map.put(arr[i],brr[i]);
        }
        for(Map.Entry<Integer,Integer>i:map.entrySet()){
            System.out.print(i.getKey()+" "+i.getValue());
            System.out.println();
        }
    }
}
