class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}
public class HierarchicalInheritanceExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.bark(); 

        System.out.println();

        Cat cat = new Cat();
        cat.eat();  
        cat.meow(); 
    }
}





