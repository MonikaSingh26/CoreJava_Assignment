package Assignment4;

public class Account extends Thread {
    String name;
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void safeWithdrawalAmount(double withdrawAmount) {
        Thread t = Thread.currentThread();
        if (getBalance() >= withdrawAmount) {
            System.out.println("Balance Before Withdraw Account Balance of:" + t.getName() + "is" + getBalance());
            balance = getBalance() - withdrawAmount;
            System.out.println(t.getName() + "has Withdrawal Amount" + withdrawAmount + "and Remaining Balance is" + getBalance());
        } else {
            System.out.println("Insufficient Balance" + t.getName());
        }
    }

    public void unsafeWithdrawalAmount(double withdrawAmount) {
        Thread t = Thread.currentThread();
        if (getBalance() >= withdrawAmount) {
            System.out.println("Balance Before Withdraw Account Balance of:" + t.getName() + "is" + getBalance());
            balance = getBalance() - withdrawAmount;
            System.out.println(t.getName() + "has Withdrawal Amount" + withdrawAmount + "and Remaining Balance is" + getBalance());
        } else {
            System.out.println("Insufficient Balance" + t.getName());
        }
    }
}
