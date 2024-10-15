class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello World from Thread!");
    }
}

class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World from Runnable!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();

        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start();
    }
}
