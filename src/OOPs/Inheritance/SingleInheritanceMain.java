package OOPs.Inheritance;

class SingleInheritance {
    void display() {
        System.out.println("This is Single Inheritance.");
    }
}

class subclass extends SingleInheritance {
    void show() {
        System.out.println("This is the SubClass inheriting from SingleInheritance.");
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {
        subclass obj = new subclass();
        obj.display(); // Inherited method
        obj.show();    // SubClass method
    }
}
