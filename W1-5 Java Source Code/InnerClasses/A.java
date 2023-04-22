package InnerClasses;

public class A {
    public class B {
    }

    static int a = 10;

    static void displayA() { System.out.println(a); }

    A() { System.out.println("constructor"); }
}
