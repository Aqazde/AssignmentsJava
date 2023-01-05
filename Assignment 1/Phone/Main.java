public class Main {
    public static void main(String[] args) {
        Phone mother = new Phone("+777799992211","Ipad pro", 250.3f);
        Phone father = new Phone(" +491995969", "Iphone 12", 210);
        Phone brother = new Phone(" +411519181", "Samsuns S10", 219.3f);
        Phone me = new Phone("+4915159957622", "Toyota", 2341.3f);
        mother.print();
        father.print();
        brother.print();
        mother.receiveCall("Mama");
        father.receiveCall("Papa");
        brother.receiveCall("Son");

        me.sendMessage("123", "213213");
    }
}