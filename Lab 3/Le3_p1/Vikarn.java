package Le3_p1;

public class Vikarn extends Kaurav {
    public Vikarn(String name, int age) {
        super(name, age);
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
