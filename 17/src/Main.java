import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");

        Employee e = new Employee();
        System.out.println("Employee : ");
        e.get();
        e.getspc();
        System.out.println("Employee details : ");
        e.printSalary();
        e.print();
        e.putspc();
        Manager m = new Manager();
        System.out.println("Manager : ");
        m.get();
        m.getdept();
        System.out.println("Manager details : ");
        m.printSalary();
        m.print();
        m.putdept();
    }
}
class Member
{
    String name;
    int age;
    String pno;
    String add;
    int sal;

    void get()
    {
        System.out.println("Enter your name : ");
        Scanner obj = new Scanner(System.in);
        name = obj.nextLine();
        System.out.println("Enter your age : ");
        Scanner obj1 = new Scanner(System.in);
        age = obj1.nextInt();
        System.out.println("Enter your phone no. : ");
        Scanner obj2 = new Scanner(System.in);
        pno = obj2.nextLine();
        System.out.println("Enter your address : ");
        Scanner obj3 = new Scanner(System.in);
        add = obj3.nextLine();
        System.out.println("Enter your salary : ");
        Scanner obj4 = new Scanner(System.in);
        sal = obj4.nextInt();

    }
    void printSalary()
    {
        System.out.println("Salary : " +sal);
    }
    void print()
    {
        System.out.println("Name : " +name);
        System.out.println("Age : "+age);
        System.out.println("Phone No. : "+pno);
        System.out.println("Address : "+add);
    }
}
class Employee extends Member
{
    String spc;
    void getspc()
    {
        System.out.println("Enter your specialization : ");
        Scanner obj5 = new Scanner(System.in);
        spc = obj5.nextLine();
    }
    void putspc()
    {
        System.out.println("Specialization : " +spc);
    }
}
class Manager extends Member
{
    String dept;
    void getdept()
    {
        System.out.println("Enter your department : ");
        Scanner obj6 = new Scanner(System.in);
        dept = obj6.nextLine();
    }
    void putdept()
    {
        System.out.println("Department : " +dept);
    }
}