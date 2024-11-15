import java.util.*;
public class spiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int bot=r-1;
        int left=0;
        int right =c-1;
        ArrayList<Integer>list=new ArrayList<>();
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                list.add(mat[i][right]);
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    list.add(mat[bot][i]);
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        for(int num:list){
            System.out.print(num+" ");
        }

    }
}
