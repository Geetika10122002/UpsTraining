import java.util.*;
public class sortstack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        Stack<Integer>st1=new Stack<>();
        st.push(11);
        st.push(31);
        st.push(10);
        st.push(8);
        st.push(15);
        int n=st.size();
        for(int i=0;i<n;i++){
            int c=min(st);
            st1.push(c);
            popvalue(st,c);
        }
        System.out.print(st1);
    }
    public static int min(Stack<Integer>st){
        int min=Integer.MAX_VALUE;
        for(int num:st){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
    public static void popvalue(Stack<Integer>st,int min){
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        if(top!=min){
            popvalue(st,min);
            st.push(top);
        }
    }
}
