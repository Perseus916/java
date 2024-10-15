import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        MyThreadOne m = new MyThreadOne();
        m.start();
    }
}
class MyThreadOne extends Thread
{
    public void run() {
        Random r = new Random();
        int num = r.nextInt(90)+10;
        System.out.println(num);
        if(num%2==0){
            MyThreadTwo s = new MyThreadTwo(num);
            s.start();
        }
        if(num%2!=0){
            MyThreadThree c = new MyThreadThree(num);
            c.start();
        }
        try{
            sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class MyThreadTwo extends Thread
{
    int x;
    MyThreadTwo(int n) {
        x = n;
    }
    public void run() {
        int s = x*x;
        System.out.println("Square of "+x+" is " +s);
    }
}
class MyThreadThree extends Thread
{
    int x;
    MyThreadThree(int n) {
        x = n;
    }
    public void run() {
        int c = x*x*x;
        System.out.println("Cube of "+x+" is " +c);
    }
}