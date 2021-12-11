package Assignment5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializationTest {

    public static void main(String[] args) throws IOException {

        // Deserialization
        try
            // Reading the object from a file
            (FileInputStream fileInputStream = new FileInputStream("output1.ser")) {
                try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                    //Method for deserialization of list
                    List<Student> students = (ArrayList<Student>) objectInputStream.readObject();

                    if (students != null) {
                        for (Student student : students) {
                            System.out.println(student.toString());
                        }
                    }
                    System.out.println("Object has been deserialized ");

                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (ClassNotFoundException classNotFoundException) {
                    classNotFoundException.printStackTrace();
                }
            } catch(IOException ioException) {
                ioException.getMessage();
            }
        }
    }
