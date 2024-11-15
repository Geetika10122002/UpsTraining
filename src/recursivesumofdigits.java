import java.util.*;
public class recursivesumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sumofdigits(n);
        System.out.print(sum);
    }
    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
            int last=n%10;
            return last+sumofdigits(n/10);

    }
}
