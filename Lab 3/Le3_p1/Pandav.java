package Le3_p1;

public class Pandav extends Person {
    public Pandav(String name, int age) {
        super(name, age);
    }

    @Override
    public void fight() {
        System.out.println(getName() + " is a skilled fighter");
    }

    @Override
    public void obey() {
        System.out.println(getName() + " is obedient");
    }

    @Override
    public void kindness() {
        System.out.println(getName() + " is kind");
    }
}
