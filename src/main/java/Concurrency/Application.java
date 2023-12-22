package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Application {

    public static AtomicInteger value = new AtomicInteger(0);

    public static void main(String[] args){

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();


    }

    public static Runnable runnable1 = () -> {
        for(int i=0; i<10; i++){
            System.out.println("Runnable1 new value: " + value.incrementAndGet());
            System.out.println("\n");
        }

    };

    public static Runnable runnable2 = () -> {
        for(int i=0; i<20; i++){
            System.out.println("Runnable2 new value: " + value.incrementAndGet());
            System.out.println("\n");
        }

    };
}
