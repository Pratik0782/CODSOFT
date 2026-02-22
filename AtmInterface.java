import java.util.Scanner;

class BankAccount {
    private double balance;

    //initialize bankaccount with initial bank balance 5000
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //return balance used by ATM class
    public double getbalance() {
        return balance;
    }

    //deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Rs " + amount + " deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }
   //withdraw amount if balance is equal to or grater than amount
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Rs " + amount + " withdrawn successfully");
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount");
            return false;
        }
    }
}

class ATM {
    private BankAccount account;
  
    //link ATM to BankAccount
    public ATM(BankAccount account) {
        this.account = account;
    }

    public void menu() {
        System.out.println("\n---------- ATM Menu --------");
        System.out.println("1: Check Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Exit");
        System.out.print("Enter your choice: ");
    }

    public void checkbalance() {
        System.out.println("Your current balance is Rs " + account.getbalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount useraccount = new BankAccount(5000);
        ATM atm = new ATM(useraccount);

        int ch;
        do {
            atm.menu();
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    atm.checkbalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double damount = sc.nextDouble();
                    atm.deposit(damount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wamount = sc.nextDouble();
                    atm.withdraw(wamount);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM ");
                    break;

                default:
                    System.out.println("Enter correct choice!");
            }

        } while (ch != 4);

        sc.close();
    }
}
