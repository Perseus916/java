import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("First Employee : ");
        e1.set();
        e1.get();
        e1.raise();
        Employee e2 = new Employee();
        System.out.println("Second Employee : ");
        e2.set();
        e2.get();
        e2.raise();
    }
}
class Employee {
    String fname;
    String lname;
    double salary;

    Employee() {
        fname = "";
        lname = "";
        salary = 0;
    }
    void set() {
        System.out.println("Enter your first name : ");
        Scanner obj = new Scanner(System.in);
        fname = obj.nextLine();
        System.out.println("Enter your last name : ");
        Scanner obj1 = new Scanner(System.in);
        lname = obj1.nextLine();
        System.out.println("Enter your yearly salary : ");
        Scanner obj2 = new Scanner(System.in);
        salary = obj2.nextDouble();
        if(salary<0) {
            salary = 0.0;
        }
    }
    void get() {
        System.out.println("First name : "+fname);
        System.out.println("Last name : "+lname);
        System.out.println("Yearly Salary : "+salary);
    }
    void raise() {
        double d = salary + 0.1*salary;
        System.out.println("Raise in salary : "+d);
    }
}