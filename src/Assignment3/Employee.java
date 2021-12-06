package Assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class Employee implements Serializable {

    long id;
    String name;
    String emailAddress;
    int age;
    String dateOfBirth;

    Employee(long id, String name, String emailAddress, int age, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
    public String toString() {
        return (id +","+name+","+ emailAddress +","+age+","+dateOfBirth);
    }
}

class EmployeeDetails {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("employees.txt");
        ArrayList<Employee> list = new ArrayList<Employee>();
        ObjectOutputStream objectoutputstream = null;
        ObjectInputStream objectinputstream = null;
        ListIterator li = null;

        if (f.isFile()) {
            objectinputstream = new ObjectInputStream(new FileInputStream(f));
            list = (ArrayList<Employee>) objectinputstream.readObject();
            objectinputstream.close();
        }

        while (true) {
            System.out.println("1.Add an Employee Details:");
            System.out.println("2.Display an Employee Details");
            System.out.println("3.Search an Employee Details:");
            System.out.println("4.Delete an Employee Details:");
            System.out.println("5.Exit");
            System.out.println("Kindly Enter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String name, email_address, dateOfBirth;
                    int age, num;
                    long id;
                    System.out.println("Add Employee Details");
                    System.out.println("Enter how many Employees you want to add: ");
                    num = sc.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Enter ID Number of the Employee: ");
                        id = sc.nextLong();
                        System.out.println("Enter Name of the Employee: ");
                        name = sc.next();
                        System.out.println("Enter Email Address of the Employee: ");
                        email_address = sc.next();
                        System.out.println("Enter Age of the Employee: ");
                        age = sc.nextInt();
                        System.out.println("Enter Date of Birth");
                        dateOfBirth = sc.next();
                        list.add(new Employee(id, name, email_address, age, dateOfBirth));
                    }
                    objectoutputstream = new ObjectOutputStream(new FileOutputStream(f));
                    objectoutputstream.writeObject(list);
                    objectoutputstream.close();
                break;

                case 2:
                    System.out.println("Display Employee Details");
                    li = list.listIterator();
                    while (li.hasNext())
                        System.out.println(li.next());
                break;

                case 3:
                    boolean found = false;
                    System.out.println("Search Employee Details");
                    System.out.println("Enter Employee ID Number to Search:");
                    long empID = sc.nextLong();
                    li = list.listIterator();
                    while (li.hasNext()) {
                        Employee e = (Employee) li.next();
                        if (e.id == empID) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee Record not Found");
                    }
                break;

                case 4:
                    found = false;
                    System.out.println("Delete Employee Details");

                    System.out.println("Enter Employee ID Number to Search:");
                    long delempID = sc.nextLong();
                    li = list.listIterator();
                    while (li.hasNext()) {
                        Employee e = (Employee) li.next();
                        if (e.id == delempID) {
                            li.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee Record not Found");
                    } else {
                        System.out.println("Employee Details Deleted Successfully");
                    }
                break;

                case 5:
                    System.exit(0);
                break;

                default:
                    System.out.println("The Choice you have enter is Invalid, Please enter valid Choice");
            }
        }
    }
}