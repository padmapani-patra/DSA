import java.util.concurrent.*;

public class ExecutorAsync {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<String> future = executor.submit(() -> {
            Thread.sleep(1000);
            return "Async Task Done!";
        });

        System.out.println("Main thread continues...");
        
        System.out.println(future.get()); // Blocks until result is available
        System.out.println("Main thread continues...2");

        executor.shutdown();
    }
}