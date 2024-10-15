import java.util.Scanner;

interface Shapes2 {
    default void color() {
        System.out.println("Color is red");
    }

    public void enter();

    public void display();
}

class Rectangle2 implements Shapes2 {
    Scanner sc = new Scanner(System.in);
    int length, width;

    public void enter() {
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the width:");
        width = sc.nextInt();
    }

    public void area() {
        int ans = length * width;
        System.out.println("Area of rectangle is " + ans);
    }

    public void display() {
        color();
        area();
    }
}

class Circle2 implements Shapes2 {
    Scanner sc = new Scanner(System.in);
    float r;
    float ans;

    public void enter() {
        System.out.println("Enter the radius:");
        r = sc.nextFloat();
    }

    public void area() {
        ans = (float) (3.14 * r * r);
    }

    public void display() {
        area(); // Area should be called before display
        System.out.println("Area of circle is " + ans);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");
        Rectangle2 re = new Rectangle2();
        re.enter();
        re.display();

        Circle2 c = new Circle2();
        c.enter();
        c.display();

    }
}
