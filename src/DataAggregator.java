public class DataAggregator implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }

}
