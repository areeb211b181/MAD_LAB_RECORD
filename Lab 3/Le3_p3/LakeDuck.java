package Le3_p3;

public class LakeDuck implements Duck, Quackable {
    @Override
    public void swim() {
        System.out.println("Lake duck can swim in lake");
    }

    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
