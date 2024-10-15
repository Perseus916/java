import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        String s = "CHARUSAT UNIVERSITY";
        System.out.println("Enter your name : ");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int a = s.length();
        System.out.println("Length of string is : " +a);
        char ch[] = s.toCharArray();
        char ch1[] = str.toCharArray();
        ch[1] = ch1[0];
        String s1 = new String(ch);
        System.out.println(s1);
        String b = s1.toLowerCase();
        System.out.println("Conversion to lowercase : " +b);
    }
}