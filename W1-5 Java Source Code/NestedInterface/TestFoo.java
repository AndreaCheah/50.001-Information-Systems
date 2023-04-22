package NestedInterface;

public class TestFoo {
    public static void main(String[] args) {
        // TODO Instantiate the Foo class
        Foo foo = new Foo();
        // TODO Invoke the thirsty() method
        Foo.Bar c = new C();
        foo.thirsty(c);
        // if you don't think you will use C object more than once
        // pass anonymous object
        // anonymous because we didn't assign it a variable name
//        foo.thirsty( new C() );
    }
    // TODO Write a class which implements foo.Bar
    // syntax: outerclass.nested_interface
    static class C implements Foo.Bar {
        @Override
        public void drink() {
            System.out.println("gulp");
        }
    }
}
