import java.lang.Thread;

public class Threading {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Hey - " + Thread.currentThread().getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
