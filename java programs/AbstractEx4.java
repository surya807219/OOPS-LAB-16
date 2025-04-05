abstract class Character {
    String name;

    Character(String name) {
        this.name = name;
    }
    abstract void attack();

    void showCharacter() {
        System.out.println("Character: " + name);
    }
}
class Warrior extends Character {
    Warrior(String name) {
        super(name);
    }
    void attack() {
        System.out.println(name + " attacks with a sword!");
    }
}
class Mage extends Character {
    Mage(String name) {
        super(name);
    }
    void attack() {
        System.out.println(name + " casts a fireball spell!");
    }
}

public class AbstractEx1 {
    public static void main(String[] args) {
        Character c1 = new Warrior("Thor");
        Character c2 = new Mage("Merlin");

        c1.showCharacter();
        c1.attack();

        c2.showCharacter();
        c2.attack();
    }
}
