import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println(r.area());
        System.out.println(r.per());
        Square q = new Square(10);
        System.out.println(q.area());
        System.out.println(q.per());
    }
}
class Rectangle {
    int length, breadth;
    Rectangle(int x, int y) {
        length = x;
        breadth = y;
    }
    int area() {
        return length*breadth;
    }
    int per() {
        return 2*(length+breadth);
    }
}
class Square extends Rectangle {
    Square(int s) {
        super(s,s);
    }
}