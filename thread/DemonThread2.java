package thread;

public class DemonThread2 {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + " Thread Started");
            try {
                Thread.sleep(2_000);
                System.out.println(Thread.currentThread().getName() + " Thread Finished");
            } catch (InterruptedException e) {
                System.out.println("Cannot sleep");
            }
        };

        System.out.println("Main Thread Started");
        Thread t1 = new Thread(runnable, "My thread");
        t1.start();

        Runnable runnable2 = () -> {
            System.out.println(Thread.currentThread().getName() + " Thread Started");
            try {
                Thread.sleep(3_000);
                System.out.println(Thread.currentThread().getName() + " Thread Finished");
            } catch (InterruptedException e) {
                System.out.println("Cannot sleep");
            }
        };

        Thread t2 = new Thread(runnable2, "My thread 2");
        t2.start();
        System.out.println("Main Thread Finished");
    }
}
