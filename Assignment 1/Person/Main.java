public class Main {
    public static void main(String[] args) {
    Person Dilya = new Person();
    Person Alaska = new Person("Alaska Alina", 20);
    Dilya.setAge(19);
    Dilya.setFullName("Dilya Lucifile");
    Dilya.move();
    Dilya.talk();
    Alaska.move();
    Alaska.talk();

    }
}