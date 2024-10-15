import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the file: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the word to search for: ");
        String wordToSearch = scanner.nextLine();

        Integer count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(wordToSearch)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + wordToSearch + "' was found " + count + " times.");
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
