public class ThreadUse02 {
    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        /*
        ThreadA threada = new ThreadA();
        Thread th1 = new Thread(threada);
        th1.start();
        */

        ThreadA threadb = new ThreadA();
        Thread th2 = new Thread(threadb);
        th2.start();
        System.out.println("Main thread terminated.");
        
    }
}


class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running.");
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        System.out.println("Thread terminated.");
    }
}


