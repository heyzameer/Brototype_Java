package OOPs.Inheritance;
interface MultipleInheritanceInterface1 {
    void method1();
}

interface MultipleInheritanceInterface2 {
    void method2();
}

class MultipleInheritance implements MultipleInheritanceInterface1, MultipleInheritanceInterface2 {
    public void method1() {
        System.out.println("Method from MultipleInheritanceInterface1.");
    }

    public void method2() {
        System.out.println("Method from MultipleInheritanceInterface2.");
    }
}

public class MultipleInheritanceMain {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method1();
        obj.method2();
    }
}
