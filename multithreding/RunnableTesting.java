public class RunnableTesting {
    public static void main(String[] args) {

        Runnable runnable = new MyTask();
        Thread t = new Thread(runnable);
        t.start();
    }
}

class MyTask implements Runnable {
    public void run() {
        System.out.println("Printing runnable");
    }
}