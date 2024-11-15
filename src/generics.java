import java.util.*;
class generics {
    public void main(String[] args) {
        Test<Integer> oobj=new Test<>(15);
        System.out.print(oobj.getObject());

    }
    class Test<T>{
        T obj;
        Test(T obj){
            this.obj = obj;
        }
        public T getObject(){
            return this.obj;
        }
    }
}
