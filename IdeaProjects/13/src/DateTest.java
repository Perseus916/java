import java.util.Scanner;
public class DateTest {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        Date d = new Date();
        d.set();
        d.get();
        d.display();
    }
}
class Date {
    int month, day, year;
    Date()
    {
        month = 0;
        day = 0;
        year = 0;
    }
    void set()
    {
        System.out.println("Enter a month : ");
        Scanner obj = new Scanner(System.in);
        month = obj.nextInt();
        System.out.println("Enter a day : ");
        Scanner obj1 = new Scanner(System.in);
        day = obj1.nextInt();
        System.out.println("Enter a year : ");
        Scanner obj2 = new Scanner(System.in);
        year = obj2.nextInt();
    }
    void get()
    {
        System.out.println("Day : " +day);
        System.out.println("Month : " +month);
        System.out.println("Year : " +year);
    }
    void display()
    {
        System.out.println("The date is : " +day +"/" +month +"/" +year);
    }
}
