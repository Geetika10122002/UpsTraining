import java.util.*;
public class genericarray{
    public static <T> boolean arrayEqual(T[] arr, T[] brr){
        if(arr.length!=brr.length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(brr[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr =new Integer[n];
        Integer[] brr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        System.out.print(arrayEqual(arr,brr));
    }
}