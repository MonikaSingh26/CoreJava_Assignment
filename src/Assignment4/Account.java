package Assignment4;

public class Account extends Thread {
    public String name;
    public double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void unsafeWithdrawalAmount(double withdrawAmount) {
        Thread t = Thread.currentThread();
        if (withdrawAmount <= getBalance()) {
            System.out.println(t.getName() + "  Your Account Balance Before Withdrawal is  " + getBalance());
            balance = getBalance() - withdrawAmount;
            System.out.println(t.getName() + "   has Withdrawal Amount is  " + withdrawAmount + "  and your Remaining Balance is  " + getBalance());
        } else {
            System.out.println("The amount you enter for withdrawal is overdraw  " + t.getName());
        }
    }

    synchronized void safeWithdrawalAmount(double withdrawAmount) {
        Thread t = Thread.currentThread();
        if (withdrawAmount <= getBalance()) {
            System.out.println(t.getName() + "  Your Account Balance Before Withdrawal is  " + getBalance());
            balance = getBalance() - withdrawAmount;
            System.out.println(t.getName() + "   has Withdrawal Amount is  " + withdrawAmount + "  and your Remaining Balance is  " + getBalance());
        } else {
            System.out.println("The amount you enter for withdrawal is overdraw  " + t.getName());
        }
    }
}

