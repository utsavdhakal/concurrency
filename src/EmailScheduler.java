public class EmailScheduler implements Runnable {

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        /*Thread.yield();*/
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new EmailScheduler());
        Thread thread2 = new Thread(new DataAggregator());

        thread.setName("email scheduler");
        thread2.setName("data aggregator");

        thread.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread2.start();

        try {
            thread2.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("inside main thread..");
    }

}
