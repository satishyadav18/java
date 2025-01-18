class Account {
    String name;
    int accountNumber;
    double balance;

    Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
}

class Curr_Acct extends Account {
    static final double MIN_BALANCE = 1000;
    static final double PENALTY = 100;

    Curr_Acct(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    void checkAndApplyPenalty() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Penalty applied. New Balance: Rs. " + balance);
        }
    }
}

class Savn_Acct extends Account {
    static final double INTEREST_RATE = 0.05;

    Savn_Acct(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    void computeAndDepositInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added. New Balance: Rs. " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Curr_Acct currAcc = new Curr_Acct("John", 12345, 400);
        Savn_Acct savAcc = new Savn_Acct("Alice", 54321, 2000);

        currAcc.deposit(500);
        currAcc.displayBalance();
        currAcc.checkAndApplyPenalty();
        
        savAcc.deposit(1000);
        savAcc.displayBalance();
        savAcc.computeAndDepositInterest();
    }
}
