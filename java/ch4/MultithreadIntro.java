package ch4;

class Test extends Thread{
    public void run() {
        System.out.println("New thread running.");
    }
}

class Test2 implements Runnable {
    public void run() {
        System.out.println("New thread running.");
    }
}

public class MultithreadIntro {
    // Difference between process and thread
    /*
     * Process: A process is an executing program. It consists of a code segment
     * (which contains the program instructions) and a data segment (which
     * contains the variables, etc. used by the program). A process also has
     * some associated properties, such as a unique process identifier (PID),
     * security attributes, and so on.
     *
     * Thread: A thread is a subset of a process. A process can have one or more
     * threads. A thread has its own stack, and a thread shares the code segment
     * and the data segment of the process to which it belongs. A thread also
     * has some associated properties, such as an execution state (running,
     * ready, and so on) and a unique thread identifier.
     *
     * A process can have multiple threads, and each thread has its own stack.
     * Each thread shares the code and data segments of the process to which it
     * belongs. A thread has its own execution state and a unique thread
     * identifier.
     */
    // Difference between multitasking and multithreading
    /*
     * Multitasking: Multitasking is the process of executing multiple tasks
     * simultaneously. For example, you can listen to music while typing a
     * document. In this case, the computer is multitasking, because it is
     * executing two tasks simultaneously. Task refers to a process or a
     * program.
     *
     * Multithreading: Multithreading is the process of executing multiple
     * threads simultaneously. For example, word processors use multithreading.
     * In a word processor, you can edit a document while printing another
     * document in the background. In this case, the word processor is
     * multithreading, because it is executing two threads simultaneously.
     */
    // Advantages of multithreading
    /*
     * 1. Multithreading improves the performance of an application by
     * increasing the responsiveness of the user interface.
     *
     * 2. Multithreading reduces the cost of communication between different
     * processes.
     *
     * 3. Multithreading improves the design and structure of an application.
     *
     * 4. Multithreading improves the utilization of a CPU by reducing the idle
     * time of a CPU.
     */
    // Disadvantages of multithreading
    /*
     * 1. Multithreading increases the complexity of a program.
     *
     * 2. Multithreading can lead to race conditions, deadlocks, and other
     * problems.
     *
     *  - What is race condition?
     *      Race condition is a situation in which two or more threads or
     *      processes are reading or writing some shared data, and the final
     *     result depends on the timing of how the threads are scheduled.
     *
     * - What is deadlock?
     *     Deadlock is a situation in which two or more threads or processes
     *    are waiting for each other to release a resource, which is held by
     *   one of the threads or processes.
     *
     */
    /*
     * In Java, multiple threads can run concurrently. Concurrency refers to the ability of a system to
     * handle multiple tasks simultaneously, but it doesn't necessarily mean that those tasks are executing in parallel
     * on multiple physical cores. The Java Virtual Machine (JVM) manages threads, and it can switch between them rapidly to
     * give the illusion of parallel execution,
     * even on systems with a single core. However, on multi-core systems, threads can indeed run in parallel on different cores.
     */
    // Two ways to create a thread
    /*
     * 1. By extending the Thread class
     *
     * 2. By implementing the Runnable interface
     */

     public static void main(String[] args) {
        System.out.println("This is a main thread.");
        // Extending thread class
        // Test t = new Test();
        // Using Runnable Interface
        // Thread t = new Thread(new Test2());
        Thread t = new Thread(()-> System.out.println("New thread running")); //using lamda expression since runnable is functional interface
        t.start();
        System.out.println("Main thread ends.");
     }

}
