import java.util.*;
public class ups1 {
    Scanner sc=new Scanner(System.in);
    static int day1=10;
    static int day2=20;
    public static int func(int day1,int day2){
        day1++;
        day2++;
        return day1;
    }
    public static void main(String[] args){
         System.out.print(day1+" "+day2);
    }
}
