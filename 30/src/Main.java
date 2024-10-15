import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("Enter text to write to the file (type 'exit' to finish):");
            String inputLine;

            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine();
            }

            System.out.println("Text has been written to 'output.txt' successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
