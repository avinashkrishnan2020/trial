package Concurrency;

public class Task implements Runnable{
    static int count = 0;
    int id;

    public Task(){
        this.count++;
        this.id = count;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + "Task: " + id);
    }
}
