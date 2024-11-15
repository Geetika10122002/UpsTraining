import java.util.*;
class simplegeneric{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Box<Integer>integer=new Box<>();
        int n=sc.nextInt();
        integer.add(n);
        System.out.println(integer.get());
        Box<String>string=new Box<>();
        String s=sc.next();
        string.add(s);
        System.out.println(string.get());
    }
}
class Box<T>{
    private T item;
    public void add(T item){
        this.item=item;
    }
    public T get(){
        return item;
    }
}