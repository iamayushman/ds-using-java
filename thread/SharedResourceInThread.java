package thread;

import thread.model.SharedResource;

public class SharedResourceInThread {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        System.out.println("Main thread started");
        System.out.println("Shared Resource value: " + sharedResource.isFlag() + " " + sharedResource.hashCode());

        Runnable r1 = () -> {
            System.out.println(Thread.currentThread().getName() + " Started");
            System.out.println("r1 Shared Resource value: " + sharedResource.isFlag() + " " + sharedResource.hashCode());
            try {
                Thread.sleep(3000);
                sharedResource.setFlag(true);
                System.out.println(Thread.currentThread().getName() + " Finished");
                System.out.println("r1 Shared resouce value: " + sharedResource.isFlag() + " " + sharedResource.hashCode());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable r2 = () -> {
            System.out.println(Thread.currentThread().getName() + " Started");
            System.out.println("r2 Shared resouce value: " + sharedResource.isFlag() + " " + sharedResource.hashCode());

            while (!sharedResource.isFlag()) {
                // bhag milkha bhag
            }
            System.out.println(Thread.currentThread().getName() + " Finished");
            System.out.println("r2 Shared resouce value: " + sharedResource.isFlag() + " " + sharedResource.hashCode());

        };

        Thread t1 = new Thread(r1, "R1");
        Thread t2 = new Thread(r2, "R2");

        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}
