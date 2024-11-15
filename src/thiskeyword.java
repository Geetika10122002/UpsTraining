import java.util.*;
public class thiskeyword {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(21);
        obj.setName("Geetika");
        System.out.print(obj.getName()+":"+obj.getAge());
    }
}
class Human{
    private int age;
    private String  name;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
