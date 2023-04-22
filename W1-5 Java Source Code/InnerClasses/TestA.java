package InnerClasses;

public class TestA {
    public static void main(String[] args) {
        // Instantiate class A object
        A a1 = new A();
        // Instantiate class B (which is an inner class of A) object
        // Call a new instance of A, followed by calling a new instance of B
        // 1st way
        A.B b1 = new A().new B();
        // 2nd way
        A.B b2 = a1.new B();

        // TODO Access static variable a of class A
        System.out.println(A.a);

        // TODO Access static method displayA() of class A
        A.displayA();
    }
}
