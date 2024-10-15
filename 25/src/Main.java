public class Main {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");

        TestThrowThrows test = new TestThrowThrows();

        try {
            test.riskyMethod(true);  // Change to false to avoid exception
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
// Define a custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// A class with a method that throws CustomException
class TestThrowThrows {
    public void riskyMethod(boolean triggerException) throws CustomException {
        if (triggerException) {
            throw new CustomException("This is a custom exception message.");
        }
        System.out.println("Method executed successfully.");
    }
}
