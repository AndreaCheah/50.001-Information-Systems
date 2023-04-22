package InnerClasses;

public class OuterClass {
    public int a;
    // No-arg constructor
    OuterClass() { a = 10; }
    void outerPrintA() { System.out.println(a); }

    class InnerClass {
        private int c;
        public InnerClass() { this.c = 100; }
        void innerPrintA() {
            //TODO - Two ways
            // We can call the object of outerclass
            System.out.println(a);
            // We can also call the method of outerclass
            outerPrintA();
        }

        // return outerclass object
        OuterClass giveBackOuter() {
            // TODO
            // return outerclass
            return OuterClass.this;
            // to return innerclass instead:
            //return this;
        }
    }
}
