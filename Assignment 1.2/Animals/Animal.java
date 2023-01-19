
public class Animal {
    public String name;
    public String food;
    public String location;
    public Animal() {

    }
    public Animal(String name,String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
    public void makeNoise() {
        System.out.println("Animal is making noise");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}