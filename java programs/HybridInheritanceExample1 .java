interface Animal {
    void eat();
}
class Mammal implements Animal {
    public void eat() {
        System.out.println("Mammals eat food.");
    }

    void breathe() {
        System.out.println("Mammals breathe oxygen.");
    }
}
interface Canine {
    void bark();
}
class Dog extends Mammal implements Canine {
    public void bark() {
        System.out.println("Dog barks.");
    }
}
public class HybridInheritanceExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();            
dog.breathe();        
dog.bark();   
}


