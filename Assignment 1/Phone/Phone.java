public class Phone {
    public String number;
    public String model;
    public double weight;
    public String name;
    public Phone() {
    }
    public Phone(String number) {
        this.number = number;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void print() {
        System.out.println("\nnumber: " + number + '\n' + "model: " + model + "\n" + "weight: " + weight + "\n");
    }
    public void receiveCall(String name) {
        System.out.println( name + " is ringing");
    }
    public void sendMessage(String ... numbers) {
        System.out.println("\n Amount of messages: " + numbers.length);
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println((i+1) + " messages from phone number: " + numbers[i]);
        }
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}
