// HelloWorldRunnable.java
public class Main implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Runnable runnable = new Main();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
