package Le3_p1;

public class Kaurav extends Person {
    public Kaurav(String name, int age) {
        super(name, age);
    }

    @Override
    public void fight() {
        System.out.println(getName() + " is a fighter");
    }

    @Override
    public void obey() {
        System.out.println(getName() + " is disobedient");
    }

    @Override
    public void kindness() {
        System.out.println(getName() + " is cruel");
    }
}
