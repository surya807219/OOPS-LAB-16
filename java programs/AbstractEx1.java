abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();

    void showName() {
        System.out.println("Animal: " + name);
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

public class AbstractEx1 {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");

        a1.makeSound();
        a2.makeSound();
    }
}
