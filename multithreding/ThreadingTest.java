public class ThreadingTest {
    public static void main(String[] args) {
        MyTask t = new MyTask();
        t.start();
    }
}

class MyTask extends Thread {

    @Override
    public void run() {
        System.out.println("printing");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("stopping");

    }
}