import java.util.*;
public class coin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int[] minc=new int[amount+1];
        Arrays.fill(minc,amount+1);
        minc[0]=0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<list.size();j++){
                if(i-list.get(j)>=0){
                    minc[i]=Math.min(minc[i],1+minc[i-list.get(j)]);
                }
            }
        }
        if(minc[amount]!=amount+1){
            System.out.print(minc[amount]);
        }
        else{
            System.out.print("Not Possible");
        }
    }
}
