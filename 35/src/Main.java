public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        MyThread first = new MyThread("First ");
        first.setPriority(3);
        MyThread second = new MyThread("Second ");
        second.setPriority(Thread.NORM_PRIORITY);
        MyThread third = new MyThread("Third ");
        third.setPriority(7);
        first.start();
        second.start();
        third.start();
    }
}
class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            Thread currentThread = Thread.currentThread();
            System.out.println("call No = "+this.getName() +currentThread.getPriority());
            try{
                sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
