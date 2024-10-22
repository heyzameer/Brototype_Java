package OOPs.Inheritance;
class HierarchicalInheritance {
    void display() {
        System.out.println("This is Hierarchical Inheritance.");
    }
}

class Dog extends HierarchicalInheritance {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends HierarchicalInheritance {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritanceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display(); // From HierarchicalInheritance
        dog.bark();    // Dog method

        Cat cat = new Cat();
        cat.display(); // From HierarchicalInheritance
        cat.meow();    // Cat method
    }
}
