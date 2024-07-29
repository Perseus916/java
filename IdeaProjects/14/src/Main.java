import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        System.out.println("Enter length of rectangle : ");
        Scanner obj = new Scanner (System.in);
        int x = obj.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        Scanner obj1 = new Scanner (System.in);
        int y = obj1.nextInt();
        Area p = new Area(x,y);
        System.out.println("Area of rectangle is : "+p.returnArea());
    }
}
class Area
{
    int l,b;
    Area(int x, int y)
    {
        l = x;
        b = y;
    }
    int returnArea()
    {
        return l*b;
    }
}