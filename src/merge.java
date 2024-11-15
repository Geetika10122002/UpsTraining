import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int ans[]=new int[n+n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        int p1=0;
        int p2=0;
        int k=0;
        while(p1<arr.length && p2<brr.length) {
            if (arr[p1] < brr[p2]) {
                ans[k++] = arr[p1];
                p1++;
            } else {
                ans[k++] = brr[p2];
                p2++;
            }
        }
        while(p1<arr.length){
            ans[k++]=arr[p1];
            p1++;
        }
        while(p2<brr.length){
            ans[k++]=brr[p2];
            p2++;
        }
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
