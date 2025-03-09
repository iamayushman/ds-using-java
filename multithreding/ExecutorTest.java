import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) {
        StatementTask task = new StatementTask("Myname");
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<String> result = es.submit(task);
        try {
            System.out.println(result.get());
        } catch (Exception e) {
            System.out.println("Error getting name");
        } finally {
            es.shutdown();
        }
    }
}

class StatementTask implements Callable<String> {

    private String name;

    public StatementTask(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String call() throws Exception {
        return "getting name using executor " + this.getName();
    }

}