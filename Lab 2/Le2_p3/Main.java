class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show(); // This will call the static show() method of the Mother class

        Child ch = new Child();
        ch.show(); // This will call the static show() method of the Child class

        Mother m1 = new Child();
        m1.show(); // This will call the static show() method of the Mother class, due to static binding

        // The following lines will cause a compilation error, since static methods are not polymorphic
        // Child c1 = new Mother();
        // c1.show();
    }
}