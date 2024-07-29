import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        Scanner obj = new Scanner(System.in);
        int x,y;
        Complex c1 = new Complex(3,2);
        c1.print();
        Complex c2 = new Complex(1,1);
        c2.print();
        Complex c3 = new Complex();
        c3 = c3.sum(c1,c2);
        System.out.println("Sum : ");
        c3.print();
        Complex c4 = new Complex();
        c4 = c4.diff(c1,c2);
        System.out.println("Difference : ");
        c4.print();
        Complex c5 = new Complex();
        c5 = c5.prod(c1,c2);
        System.out.println("Multiplication : ");
        c5.print();
    }
}
class Complex
{
    int r,i;
    Complex()
    {

    }
    Complex(int x, int y)
    {
        r = x;
        i = y;
    }
    Complex sum(Complex c1, Complex c2)
    {
        Complex obj1 = new Complex();
        obj1.r = c1.r + c2.r;
        obj1.i = c1.i + c2.i;
        return obj1;
    }
    Complex diff(Complex c1, Complex c2)
    {
        Complex obj2 = new Complex();
        obj2.r = c1.r - c2.r;
        obj2.i = c1.i - c2.i;
        return obj2;
    }
    Complex prod(Complex c1, Complex c2)
    {
        Complex obj3 = new Complex();
        obj3.r = (c1.r*c2.r)-(c1.i*c2.i);
        obj3.i = (c1.r*c2.i)+(c1.i*c2.r);
        return obj3;
    }
    void print()
    {
        System.out.println("Complex no. : "+r + "+" +i + "i");
    }
}