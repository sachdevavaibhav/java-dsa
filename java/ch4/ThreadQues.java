package ch4;

public class ThreadQues extends Thread {
    public void run() {
        System.out.println("Test");
    }
    public static void main(String[] args) {
        ThreadQues test = new ThreadQues();
        test.run();
        test.start();
    }
}

/*
 * test.run() executes the run method. test.start() creates a new thread and executes the overriden
 * run method of the Thread class. The Thread.start() method always starts a new thread, and the
 * entry point for this thread is the run() method. If you are calling run() directly it will
 * execute in the same thread BUT it is always recommendable logically calling Thread.start()
 * to start a new thread of execution followed by the run() method.
 */