import java.util.Scanner;

class Fourth {
    public static void main(String[] args) {
        System.out.println("23DIT023 - ANSH KANSARA");
        String[] product = {"Motor", "Fan", "Tube", "Wire", "Other"};
        double[] rate = {1000, 500, 200, 100, 300};
        double[] tax = {8, 12, 5, 7.5, 3};

        System.out.println("WELCOME TO SNAP APPLIANCES: ");
        int a6;
        double fp = 0;
        StringBuilder billDetails = new StringBuilder();

        Scanner obj = new Scanner(System.in);

        do {
            System.out.println("\nCHOOSE 1: Motor \t 2: Fan \t 3: Tube \t 4: Wire \t 5: Other");
            int x = obj.nextInt();
            int units;
            double price = 0;

            if (x >= 1 && x <= 5) {
                System.out.println("TELL THE NO. OF UNITS: ");
                units = obj.nextInt();

                for (int i = 0; i < units; i++) {
                    double y = (tax[x - 1] * rate[x - 1]) / 100 + rate[x - 1];
                    price += y;
                }

                fp += price;
                billDetails.append("Product: ").append(product[x - 1])
                        .append(", Units: ").append(units)
                        .append(", Price: ").append(price).append("\n");
            } else {
                System.out.println("Invalid choice. Please select a valid product.");
            }

            System.out.println("DO YOU WANT TO CONTINUE? 1 FOR YES \t 2 FOR NO");
            a6 = obj.nextInt();
        } while (a6 == 1);
        System.out.println("\nYOUR FINAL BILL IS:");
        System.out.println(billDetails.toString());
        System.out.println("Total Amount: " + fp);
    }
}
