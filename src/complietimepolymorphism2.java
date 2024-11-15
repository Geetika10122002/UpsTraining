 import java.util.*;
class mul {
    static int Multiply(int a, int b)
    {
        return a * b;
    }
    static int Multiply(int a, int b, int c)
    {
        return a * b * c;
    }
}
class compiletimepolymorphism2 {
    public static void main(String[] args)
    {
        System.out.println(mul.Multiply(2, 4));
        System.out.println(mul.Multiply(2, 7, 3));
    }
}
