package Assignment4;

// Importing classes from required packages
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.InterruptedException;


class ThreadUnsafe implements Runnable {
    Account account = new Account(1000.00);
    public void run() {
        account.unsafeWithdrawalAmount(1000);
        if (account.balance <= 0) {
            System.out.println("Account is Overdrawn");
        }
    }
}

class ThreadSafe implements Runnable {
    Account account= new Account(1000.00);
    public void run() {
        account.safeWithdrawalAmount(1000);
        if (account.balance <= 0) {
            System.out.println("Account is Overdrawn");
        }
    }
}
    public class AccountOverdrawDemo {
        // Main driver method
        public static void main(String[] args) throws InterruptedException {
            Scanner sc = new Scanner(System.in);
 while (true)
 {
            ThreadUnsafe tUnsafe = new ThreadUnsafe();
            Thread t1 = new Thread(tUnsafe);
            Thread t2 = new Thread(tUnsafe);
            t1.setName("Monika");
            t2.setName("Aparna");

            ThreadSafe tSafe = new ThreadSafe();
            Thread t3 = new Thread(tSafe);
            Thread t4 = new Thread(tSafe);
            t3.setName("Monika");
            t4.setName("Aparna");

//            while (true)
//            {
                System.out.println("1.Account Overdraw Demo With UnSafe Demo");
                System.out.println("2.Account Overdraw Demo With Safe Demo");
                System.out.println("3.Exit");
                System.out.println("Please Enter Your Choice:");

                try {
                    int choice;
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Account Overdraw Demo With UnSafe Demo");
                            t1.start();
                            t2.start();
                            break;
                        case 2:
                            System.out.println("Account Overdraw Demo With Safe Demo");
                            t3.start();
                            t4.start();
                            break;
                        case 3:
                            System.exit(0);

                        default:
                            System.out.println("The Choice you have enter is Invalid, Please enter valid Choice");
                    }
                    Thread.sleep(1500);
                } // Catch block to handle the exceptions
                catch (InputMismatchException ime) {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
