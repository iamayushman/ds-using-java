package thread;

public class DemonThread {
    public static void main(String[] args) {

        System.out.println("Main thread started.");

        Runnable runnable = () -> {
            System.out.println("Demon started. - " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
                System.out.println("Demon ended.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        Thread t = new Thread(runnable, "Runnable Demon Thread.");
        t.setDaemon(true);
        t.start();

        Thread t2 = new Thread(runnable, "Runnable Demon 2 Thread.");
        t2.setDaemon(true);
        t2.start();

        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread ended.");
    }
}
