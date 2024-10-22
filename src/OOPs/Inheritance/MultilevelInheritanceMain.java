package OOPs.Inheritance;
class MultilevelInheritance {
    void display() {
        System.out.println("This is Multilevel Inheritance.");
    }
}

class SubClass extends MultilevelInheritance {
    void show() {
        System.out.println("This is the SubClass inheriting from MultilevelInheritance.");
    }
}

class SubSubClass extends subclass {
    void print() {
        System.out.println("This is the SubSubClass inheriting from SubClass.");
    }
}

public class MultilevelInheritanceMain {
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass();
        obj.display(); // From MultilevelInheritance
        obj.show();    // From SubClass
        obj.print();   // From SubSubClass
    }
}
