class One {
    int x;
    One(int x) {
        this.x = x;
    }
}

class Two extends One {
    Two(int x) {
        super(x);
    }
}