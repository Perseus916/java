import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("23DIT023 - ANSH KANSARA");
        long n;

        System.out.println("Enter in Pounds to convert in Rupees: ");
        Scanner a= new Scanner(System.in);
        n=a.nextLong();

        System.out.println("USING USER INPUT : ");
        convert(n);

        System.out.println("USING COMMAND LINE ARGUEMENT : ");
        convert(50);
    }

    static void convert(long n){
        long a;
        a=n;

        long r = n * 100;
        System.out.println(r+" Rupees");
    }
}
