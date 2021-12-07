package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThreadSafe implements Runnable {
    Account account = new Account(1000);
    public void run() {
        account.safeWithdrawalAmount(1000);
        if (account.balance < 0) {
            System.out.println("Account is Overdrawn");
        }
    }
}

class ThreadUnsafe implements Runnable {
    Account account = new Account(1000);
    public void run() {
        account.unsafeWithdrawalAmount(1000);
        if (account.balance < 0) {
            System.out.println("Account is Overdrawn");
        }
    }
}
    public class AccountOverdrawDemo {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ThreadSafe threadSafe = new ThreadSafe();
            Thread t1 = new Thread(threadSafe);
            Thread t2 = new Thread(threadSafe);
            t1.setName("Monika");
            t2.setName("Singh");

            ThreadUnsafe threadUnsafe = new ThreadUnsafe();
            Thread t3 = new Thread(threadUnsafe);
            Thread t4 = new Thread(threadUnsafe);
            t3.setName("Monika");
            t4.setName("Singh");

            while (true) {
                System.out.println("1. Account Overdraw Demo With Safe Demo");
                System.out.println("2. Account Overdraw Demo With Unsafe Demo");
                System.out.println("3. Exit");
                System.out.println("Please Enter Your Choice:");

                try {
                    int choice;
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Account Overdraw Demo With Safe Demo");
                            t1.start();
                            t2.start();
                        case 2:
                            System.out.println("Account Overdraw Demo With Unsafe Demo");
                            t3.start();
                            t4.start();
                        case 3:System.exit(0);

                        default:System.out.println("The Choice you have enter is Invalid, Please enter valid Choice");
                    }
                    Thread.sleep(3000);
                } catch (InputMismatchException | InterruptedException ime) {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
