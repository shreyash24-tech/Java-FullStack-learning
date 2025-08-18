import java.util.*;

class BankAcc {
    private String acc_hol;
    private int acc_no;
    private double bal;

    BankAcc(String n, int an, double b) {
        acc_hol = n;
        acc_no = an;
        bal = b;
    }

    void dep(double amt) {
        
        if (amt > 0) {
            bal += amt;
            System.out.println("AMOUNT DEPOSITED");
        } else {
            System.out.println("ERROR");
        }
    }

    void wid(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
        } else {
            System.out.println("ERROR");
        }
    }

    void check_bal() {
        System.out.println("BALANCE = " + bal);
    }

    void acc_details() {
        System.out.println("NAME = " + acc_hol);
        System.out.println("ACCOUNT NO. = " + acc_no);
        System.out.println("BALANCE = " + bal);
    }
}

 public class BankAccount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String n = sc.next();
        System.out.print("Enter the Account number: ");
        int an = sc.nextInt();
        System.out.print("Enter the balance: ");
        double b = sc.nextDouble();

        BankAcc acc = new BankAcc(n, an, b);

        int ch;
        do {
            System.out.println("\nMENU");
            System.out.println("1-Deposit");
            System.out.println("2-Withdraw");
            System.out.println("3-Check Balance");
            System.out.println("4-Details");
            System.out.println("5-Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    acc.dep(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    acc.wid(sc.nextDouble());
                    break;
                case 3:
                    acc.check_bal();
                    break;
                case 4:
                    acc.acc_details();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (ch != 5);

        sc.close();
    }
}
