class Parent {
    void Print() {
        System.out.println("parent class");
    }
}
class subclass1 extends Parent {
    void Print() { System.out.println("Geetika"); }
}
class subclass2 extends Parent {
    void Print()
    {
        System.out.println("Lavanya");
    }
}
class runtimepolymorphism {
    public static void main(String[] args)
    {
        Parent a;
        a = new subclass1();
        a.Print();
        a = new subclass2();
        a.Print();
    }
}
