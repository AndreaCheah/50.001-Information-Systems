package InnerClasses;

public class TestOuterClass {
    public static void main(String[] args) {

        // TODO - Instantiate Outerclass
        OuterClass out = new OuterClass();

        // TODO - Instantiate InnerClass
        OuterClass.InnerClass in = out.new InnerClass();

        // TODO - Call outerPrintA() and innerPrintA()
        out.outerPrintA();
        in.innerPrintA();

        // TODO - Call giveBackOuter();
        OuterClass b1 = in.giveBackOuter();

        // TODO - for you to think about
        System.out.println(b1 == out);
    }
}
