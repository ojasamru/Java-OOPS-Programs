import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String holder, String number, double initialBalance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println("\nAccount Details:");
        System.out.println("Holder: " + accountHolder);
        System.out.println("Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String number = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(name, number, balance);
        userAccount.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        userAccount.deposit(depositAmount);

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        userAccount.withdraw(withdrawAmount);

        userAccount.displayBalance();
        scanner.close();
    }
}
