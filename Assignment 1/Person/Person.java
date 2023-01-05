public class Person {
    String fullName;
    int age;

    public void move() {
    System.out.println("Person named " + getFullName() + " " + getAge() + " years old," + " is moving");
    }
    public void talk() {
        System.out.println( getFullName() + " is talking.");
    }
    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
}
