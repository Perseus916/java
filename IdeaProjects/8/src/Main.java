import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        System.out.println("Enter the string");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        func(s);
    }
    public static void func(String x)
    {
        String a = x;
        String b = "";
        for(int i=0;i<a.length();i++)
        {
            b = b + a.charAt(i) + a.charAt(i);
        }
        System.out.println(b);

    }
}