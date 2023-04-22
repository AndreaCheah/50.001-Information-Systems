package NestedInterface;

public class Foo {
    // nested interfaces can be used to organise related
    // interfaces into a single unit
    interface Bar {
        // recall that all methods in an interface are abstract
        void drink();
    }

    // there's a no-arg constructor if you don't put one

    // nest this interface inside class Foo
    // because it's used by the method thirsty()
    // thirsty() method takes in an object bar that uses the Bar interface
    void thirsty(Bar bar) {
        // all Bar objects have the ability to implement the drink() method
        bar.drink();
    }
}
