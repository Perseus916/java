import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("23DIT023 - ANSH KANSARA");
        int a,n;
        Random r = new Random();
        a = r.nextInt(100);


        do
        {
            System.out.println("Guess the number : ");
            Scanner obj = new Scanner(System.in);
            n=obj.nextInt();
            if(n==a)
            {
                System.out.println("You guessed the right number");
                break;
            }
            else if(n<a)
            {
                System.out.println("The no. is greater");
            }
            else if(n>a)
            {
                System.out.println("The no. is lesser");
            }
        }while(true);
    }
}