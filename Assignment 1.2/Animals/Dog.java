

public class Dog extends Animal{
    private boolean isTrained;

    public Dog(String name, String food, String location, boolean isTrained) {
        super(name, food, location);
        this.isTrained = isTrained;
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}