package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolPractice {

    public static void main(String[] args){
//       Task task1 = new Task();
//       Task task2 = new Task();
//       System.out.println(Task.count);

        ExecutorService service = Executors.newFixedThreadPool(1);
        for(int i=0; i<100000; i++){
            System.out.println(Thread.currentThread());
            service.execute(new Task());

        }
    }


}


