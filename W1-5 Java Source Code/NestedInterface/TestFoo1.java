package NestedInterface;

// How to create an Anonymous innerclass
public class TestFoo1 {
    public static void main(String[] args) {

        // TODO Instantiate the Foo class
        Foo foo = new Foo();

        // TODO Invoke the thirsty() method using an anonymous inner class
        // similar to how you define a class
        foo.thirsty( new Foo.Bar() {
            @Override
            public void drink(){
                System.out.println("gulp");
            }
                     }
        );
    }
}
