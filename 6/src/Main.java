import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");
        func(3, "ansh");
    }
        public static void func(int x,String y)
        {
            int a = x;
            String b = y;
            String c = "",d="";
            if(y.length()<a)
            {
                for(int i=0;i<a;i++)
                    d=d+y;
            }
            else {
                for (int i = 0; i < a; i++) {
                    c = c + y.charAt(i);
                }
                for (int i = 0; i < a; i++) {
                    d = d + c;
                }
            }
            System.out.println(d);

        }

}