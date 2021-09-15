import java.util.Scanner;

public class MyFancyAccounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        int startDeposit = scanner.nextInt();
        double ir = scanner.nextDouble();

        double fv = startDeposit * (ir + 1) * 10;

        System.out.println("The Future Value is approximately: " + fv);
    }
}