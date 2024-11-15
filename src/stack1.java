import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(16);
        st.push(15);
        st.push(18);
        st.push(29);
        st.push(30);
        min(st);
    }
    public static void min(Stack<Integer>st){
        Stack<Integer>temp=new Stack<>();
        int minelement=st.peek();
        while(!st.isEmpty()){
            int current=st.pop();
            if(current<minelement){
                minelement=current;
            }
            temp.push(current);
        }
        boolean found=false;
        while(!temp.isEmpty()){
            int currentelement=temp.pop();
            st.push(currentelement);
            if(currentelement==minelement){
                found=true;
                continue;
            }
            if(found){
                System.out.print(currentelement+" ");
            }
        }
    }
}
