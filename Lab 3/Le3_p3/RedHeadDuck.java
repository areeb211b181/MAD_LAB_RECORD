package Le3_p3;

public class RedHeadDuck implements Duck, Quackable {
    @Override
    public void swim() {
        System.out.println("Red head duck can swim in lake");
    }

    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
