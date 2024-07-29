import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        parent p = new parent();
        p.get();
        child c = new child();
        c.set();
        c.get();
    }
}
class parent
{
    void get()
    {
        System.out.println("This is parent class");
    }
}
class child extends parent
{
    void set()
    {
        System.out.println("This is child class");
    }
}