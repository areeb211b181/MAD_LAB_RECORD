package Le3_p3;

public class RubberDuck implements Duck, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber duck can swim in bathtub");
    }

    @Override
    public void squeak() {
        System.out.println("Squeak! Squeak!");
    }
}
