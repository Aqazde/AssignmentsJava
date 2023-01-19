
public class Cat extends Animal{
    public boolean isMewing;
    public Cat(String name, String food, String location, boolean isMewing) {
        super(name, food, location);
        this.isMewing = isMewing;
    }
    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat is making noise");
    }

    public boolean isMewing() {
        return isMewing;
    }

    public void setMewing(boolean mewing) {
        isMewing = mewing;
    }
}
