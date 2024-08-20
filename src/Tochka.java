class Tochka {
    int x;
    int y;

    public Tochka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + '}';
    }
}

class Task {
    public static void main(String[] args) {
        Tochka a1 = new Tochka(1, 3);
        Tochka a2 = new Tochka(1, 3);
        Tochka a3 = new Tochka(5, 8);
        System.out.println(a1 == a2);
        System.out.println(a3 == a2);
    }
}

