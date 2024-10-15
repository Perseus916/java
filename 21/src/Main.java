import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        System.out.println("Enter a no. : ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        MyCalculator m = new MyCalculator();
        System.out.println(m.divisor_sum(n));
    }
}
interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        return sum;
    }
}