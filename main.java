class main {
    public static void main(String[] args) {  // changed "Static" to "static"
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }
}

class Number {
    synchronized static void odd(int n) {
        for (int i = 1; i < n; i = i + 2) {
            System.out.println(i + "\n");
        }
    }

    synchronized static void even(int n) {
        for (int i = 2; i < n; i = i + 2) {
            System.out.println(i + "\n");
        }
    }
}

class Thread1 extends Thread {
    public void run() {
        Number.odd(10);
    }
}

class Thread2 extends Thread {
    public void run() {
        Number.even(10);
    }
}
