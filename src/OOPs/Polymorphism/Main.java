package OOPs.Polymorphism;

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Nidhi implements Animal {
    @Override
    public void sound() {
        System.out.println("Nidhi makes sound: meow bow bow moew");
    }
}
public class Main {
    public static void main(String[] args) {
        // Interface reference referring to Dog object
//        Animal myDog = new Dog();
//        myDog.sound();  // Output: Dog barks
//
//        // Interface reference referring to Cat object
//        Animal myCat = new Cat();
//        myCat.sound();  // Output: Cat meows

        Animal nidhi = new Nidhi();
        nidhi.sound();
    }
}