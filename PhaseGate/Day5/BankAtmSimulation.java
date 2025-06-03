import java.util.*;

public class BankATMSimulation {
    static List<HashMap<String, Object>> transactions = new ArrayList<>();

    public static boolean[] withdrawal(double amount, double balance) {
        if (amount % 500 != 0 && amount % 1000 != 0) {
            return new boolean[]{false, true};         }

        double totalDeduction = amount + 100;

        if (amount < 0) {
            System.out.println("Error!!");
        }

        if (amount > 0.9 * balance) {
            return new boolean[]{false, false};         }

        if (balance - totalDeduction < 199) {
            return new boolean[]{false, false}; 
        }

        return new boolean[]{true, false}; 
    }

    public static void printTransactions(List<HashMap<String, Object>> transactionHistory) {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("\nTransaction Log:");
            int index = 1;
            for (Map<String, Object> record : transactionHistory) {
                System.out.printf("%d. Withdrawn: ₦%.2f, Fee: ₦%.2f, Remaining Balance: ₦%.2f%n",
                        index++,
                        (double) record.get("withdrawn"),
                        (double) record.get("transaction_fee"),
                        (double) record.get("balance"));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance;

        System.out.print("Enter your account balance (₦): ");
        balance = scanner.nextDouble();

        while (balance < 0) {
            System.out.println("Error");
            System.out.print("Enter your account balance (₦): ");
            balance = scanner.nextDouble();
        }

        scanner.nextLine(); 

        while (true) {
            System.out.printf("\nCurrent Balance: ₦%.2f%n", balance);
            System.out.print("Do you want to make a withdrawal? (yes/no/view transactions): ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("no")) {
                System.out.println("GoodBye!! Have a nice day");
                break;
            } else if (userInput.equals("view transactions")) {
                printTransactions(transactions);
                continue;
            } else if (userInput.equals("yes")) {
                System.out.print("Enter amount to withdraw (₦): ");
                
                    double amount = Double.parseDouble(scanner.nextLine());

                    if (amount > 20000) {
                        System.out.println("You can only withdraw a maximum of ₦20,000 per transaction.");
                        continue;
                    }

                    boolean[] result = withdrawal(amount, balance);
                    if (!result[0]) {
                        if (result[1]) {
                            System.out.println("Invalid transaction: The Withdrawal amount must be a multiple of 500 or 1000 naira.");
                        } else {
                            System.out.println("Invalid transaction: You Cannot withdraw more than 90% of your balance or Minimum balance of 199 naira must remain.");
                        }
                        continue;
                    }

                    double transactionFee = 100;
                    double total = amount + transactionFee;
                    balance -= total;

      }
      }
      }
      }             