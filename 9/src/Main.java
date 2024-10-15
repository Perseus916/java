import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        System.out.println("Enter the string : ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int a = s.length();
        System.out.println("Length of string is : " +a);
        String b = s.toLowerCase();
        System.out.println("Conversion to lowercase : " +b);
        String c = s.toUpperCase();
        System.out.println("Conversion to uppercase : " +c);
        String d = "";
        for (int i = a-1; i >=0 ; i--) {
            d = d + s.charAt(i);
        }
        System.out.println("Reverse of string is : " +d);
        char[] ch = new char[a];
        for (int i = 0; i < a; i++) {
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch);
        String sort = new String(ch);
        System.out.println("Sorting : "+sort);
    }
}