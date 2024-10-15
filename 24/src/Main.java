import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        try {
            throw new Exception("This is a custom exception!");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}