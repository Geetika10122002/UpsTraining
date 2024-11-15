import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[100];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<n;i++){
            if(freq[i]>0){
                System.out.print(i+" "+freq[i]+" ");
                System.out.println();
            }
        }
    }
}
