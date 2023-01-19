
public class Main {
    public static void main(String[] args) {
        Veterinary veterinary = new Veterinary();
        Dog dog = new Dog("dog Tr1bor","meat", "at home", true);
        Cat cat = new Cat("cat Milky","kittycat", "at home", true);
        Horse horse = new Horse("horse Ace", "hay", "at the field", true);
        Animal[] animals = {dog, cat, horse};

        for (Animal animal: animals) {
            veterinary.treatAnimal(animal);
        }
    }
}