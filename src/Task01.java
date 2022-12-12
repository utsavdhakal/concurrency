public class Task01 implements Runnable {

    @Override
    public void run() {
        System.out.println("task executing..");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Task01());
        thread.start();
        System.out.println("inside main thread");
    }

}
