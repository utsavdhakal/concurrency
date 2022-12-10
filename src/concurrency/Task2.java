package concurrency;

import java.util.concurrent.TimeUnit;

public class Task2 extends Thread {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task2 executing..");
    }

    public static void main(String[] args) {
        Thread thread = new Task2();
        thread.start();
        try {
            /*Thread.sleep(3000);*/
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("inside main method");
    }
}
