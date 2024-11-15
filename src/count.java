import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n>0){
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            System.out.println("No of digits: ");
            System.out.print(count);
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }
}
