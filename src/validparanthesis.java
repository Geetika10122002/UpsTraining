import java.util.*;
public class validparanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character>list=new ArrayList<>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                list.add(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if(list.size()!=0){
                    list.remove(list.size()-1);
                }
                else{
                    list.add(s.charAt(i));
                    break;
                }
            }
        }
        if(list.size()==0){
            System.out.print("balanced");
        }
        else{
            System.out.print("not balanced");
        }
    }
}
