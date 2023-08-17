package ch4;

class TestExample extends Thread {
    public void run() {
        for (int i=0; i<=15; i++) {
            System.out.println("Inside Test thread.");
        }
    }
}

public class MultithreadEx {
    public static void main(String[] args) {
        TestExample t = new TestExample();
        t.start();
        for (int i=0; i<=25; i++) {
            System.out.println("Inside main thread.");
        }
    }
}
