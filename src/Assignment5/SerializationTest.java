package Assignment5;

//Importing required classes from packages
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//Main Class
public class SerializationTest {

    //Main Driver Method
    public static void main(String[] args) {

        Address address1 = new Address("Patna", "Bihar", 848101, "India");
        Student student1 = new Student("Sneha", "25/01/1998", address1);

        Address address2 = new Address("Indore", "Madhya pradesh", 452001, "India");
        Student student2 = new Student("Smita", "05/10/1995", address2);

        Address address3 = new Address("Bhopal", "Madhya Pradesh", 462001, "India");
        Student student3 = new Student("Rohan", "09/12/1998", address3);

        Address address4 = new Address("Ahmedabad", "Gujarat", 320008, "India");
        Student student4 = new Student("Rekha", "16/05/1995", address4);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        //Serialization
        try {
            //Saving of object in a list
            FileOutputStream fileOutputStream = new FileOutputStream("output1.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Method for serialization of list
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("List has been serialized");

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
