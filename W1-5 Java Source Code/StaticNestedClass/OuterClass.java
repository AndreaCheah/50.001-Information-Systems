package StaticNestedClass;

public class OuterClass {
    public int a;
    // No-arg constructor
    OuterClass() { a = 10; }
    void outerPrintA() { System.out.println(a); }

    // we declare InnerClass static
    static class InnerClass {
        private int c;
        public InnerClass() { this.c = 100; }
        void innerPrintA() {
            // below have syntax error cuz static inner class
            // has no access to outer class object and methods
//            outerPrintA();
//            System.out.println(a);
        }

        // return outerclass object
//        OuterClass giveBackOuter() {
            // below have syntax error cuz static inner class
            // has no access to outer class object and methods
//            return OuterClass.this;
//        }
    }
}

