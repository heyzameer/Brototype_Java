package OOPs.Inheritance;
interface HybridInheritanceInterface1 {
    void method1();
}

interface HybridInheritanceInterface2 {
    void method2();
}

class HybridInheritanceBase {
    void display() {
        System.out.println("This is the base class for Hybrid Inheritance.");
    }
}

class SubClass1 extends HybridInheritanceBase implements HybridInheritanceInterface1 {
    public void method1() {
        System.out.println("Method from HybridInheritanceInterface1.");
    }
}

class SubClass2 extends HybridInheritanceBase implements HybridInheritanceInterface2 {
    public void method2() {
        System.out.println("Method from HybridInheritanceInterface2.");
    }
}

public class HybridInheritanceMain {
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();
        obj1.display(); // From HybridInheritanceBase
        obj1.method1(); // From HybridInheritanceInterface1

        SubClass2 obj2 = new SubClass2();
        obj2.display(); // From HybridInheritanceBase
        obj2.method2(); // From HybridInheritanceInterface2
    }
}
