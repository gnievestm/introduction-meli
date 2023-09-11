
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal fox = new Fox();
        a1.makeSound();

        fox.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal horse = new Horse();
        horse.makeSound();

        Animal sheep = new Sheep();
        sheep.makeSound();


    }

}
