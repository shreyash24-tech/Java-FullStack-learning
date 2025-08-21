
class InsufficientBalance extends Exception {

    public InsufficientBalance(String msg) {
        super(msg);

    }
}

class bank {

    int balance;

    bank(int intial_bal) {
        this.balance = intial_bal;
    }

    void deposite(int dep_amt) {
        balance += dep_amt;
        System.out.println("Amount=" + dep_amt + " Deposited Successfully" + "|BALANCE=" + balance);
    }

    void withdraw(int amt) throws InsufficientBalance {
        if (amt > balance) {
            throw new InsufficientBalance("Error::INSUFFICIENT BALANCE");

        }
        balance -= amt;
        System.out.println("Amount=" + amt + " is Successfully Withdrawn " + "|BALANCE=" + balance);

    }

    void getbalance() {
        System.out.println("Avalable Balance is=" + balance);

    }
}

class CustomBankException {

    public static void main(String args[]) {
        bank b = new bank(1000);
        b.deposite(1000);
        try {
            b.withdraw(1000);
            b.withdraw(2000);
            b.getbalance();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
