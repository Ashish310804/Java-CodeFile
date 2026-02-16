public class AbstractClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the implemented method
        myDog.sleep();     // Calls the inherited method
    }
}

abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
        
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof woof!");
    }
}
