package Assignment5;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private String dateOfBirth;
    private Address address;

    //Student Constructor
    public Student(String firstName, String dateOfBirth, Address address) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ",dateOfBirth=" + dateOfBirth + ",address=" + address + "]";
    }
}