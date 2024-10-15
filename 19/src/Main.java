import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        Square s = new Square();
        s.prints();
        s.printr();
    }
}
class Shape {
    void prints() {
        System.out.println("This is shape.");
    }
}
class Rectangle extends Shape {
    void printr() {
        System.out.println("This is rectangular shape.");
    }
}
class Circle extends Shape {
    void printc() {
        System.out.println("This is circular shape.");
    }
}
class Square extends Rectangle {
    void print() {
        System.out.println("Square is a rectangle.");
    }
}