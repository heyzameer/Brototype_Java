package OOPs.Inheritance;

class SingleInheritance {
    void display() {
        System.out.println("This is Single Inheritance.");
    }
}

class SubClass extends SingleInheritance {
    void show() {
        System.out.println("This is the SubClass inheriting from SingleInheritance.");
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display(); // Inherited method
        obj.show();    // SubClass method
    }
}
