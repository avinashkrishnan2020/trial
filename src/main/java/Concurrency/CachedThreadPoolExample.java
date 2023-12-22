package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        while(true){
            System.out.println(Thread.currentThread() + " Task: "+Task.count);
            executorService.execute(new Task());
        }
    }
}
