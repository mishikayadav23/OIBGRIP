import java.util.*;

public class ATM {

    public static int balance = 20000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("WELCOME TO ATM");
        System.out.println("Enter your User Id");
        String id = sc.nextLine();
        System.out.println("Enter your Pin");
        int pin = sc.nextInt();
        while (true) {
            System.out.println("Choose 1 to check balance");
            System.out.println("Choose 2 to withdraw");
            System.out.println("Choose 3 to deposit");
            System.out.println("Choose 4 to transfer");
            System.out.println("Choose 5 to EXIT");
            System.out.print("Choose your option : ");
            byte option = sc.nextByte();
            System.out.println();
            switch (option) {
                case 1:
                    Balance b = new Balance();
                    b.balance();
                    break;
                case 2:
                    Withdraw w = new Withdraw();
                    w.input();
                    break;
                case 3:
                    Deposit d = new Deposit();
                    d.deposit();
                    break;
                case 4:
                    Transfer t = new Transfer();
                    t.transfer();
                    break;
                case 5:
                    Quit q = new Quit();
                    q.quit();
                    break;

                default:
                    break;
            }
            if (option == 5) {
                break;
            }
        }
    }

    public static class Balance {
        public void balance() {
            System.out.println("Your current balance is " + balance);
        }
    }

    public static class Withdraw {
        public void input() {
            System.out.print("Enter the amount to be withdrawn : ");
            int amt = sc.nextInt();

            if (balance >= amt) {
                System.out.println("Amount withdrawn successfully.");
                balance = balance - amt;
                System.out.println("Current Balance is " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }

    }

    public static class Deposit {
        public void deposit() {
            System.out.print("Enter the amount to be deposited : ");
            int mon = sc.nextInt();
            System.out.println("\n");
            System.out.println("Amount Deposited Successfully.");
            balance = balance + mon;
            System.out.println("Current Balance is " + balance);
        }
    }

    public static class Transfer {
        public void transfer() {
            System.out.print("Enter the Account No. you want to transfer money : ");
            String acc = sc.nextLine();
            acc = sc.nextLine();
            System.out.print("Enter the amount : ");
            int am = sc.nextInt();
            System.out.println("\n");
            if (balance >= am) {
                System.out.println("Successfully Transferred to Account No. " + acc);
                balance = balance - am;
                System.out.println("Current Balance is " + balance);
            } else {
                System.out.println("Insufficient Balance!");
            }

        }
    }

    public static class Quit {
        public void quit() {
            System.out.println("Thank you. Have a nice day.");
        }
    }

}