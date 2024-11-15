import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int element =sc.nextInt();
        int index=sc.nextInt();
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==index){
                brr[i]=element;
            }
            else{
                brr[i]=arr[i];
            }
        }
        for(int i:brr){
            System.out.print(i+" ");
        }
    }
}
