package Le3_p1;

public class Main {
    public static void main(String[] args) {
        Person arjun = new Pandav("Arjun", 30);
        Person bheem = new Pandav("Bheem", 32);
        Person duryodhan = new Kaurav("Duryodhan", 35);
        Person vikarn = new Vikarn("Vikarn", 28);

        arjun.fight();
        arjun.obey();
        arjun.kindness();

        bheem.fight();
        bheem.obey();
        bheem.kindness();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kindness();

        vikarn.fight();
        vikarn.obey();
        vikarn.kindness();
    }
}
