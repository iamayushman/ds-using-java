import java.lang.Thread;

public class AllJavaAppIsAThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Default Thread name: " + t.getName());

        t.setName("MyCustomNameForMainThread");
        System.out.println("Custom name of a thread: " + t.getName());

        System.out.println("Priority : " + t.getPriority());

        MyClass c = new MyClass();
        c.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("-------Hey from : " + Thread.currentThread().getName() + " - - - -" + i);
        }
    }

    static class MyClass extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Hey from : " + Thread.currentThread().getName() + " - - - -" + i);
            }
            super.run();
        }

    }
}
