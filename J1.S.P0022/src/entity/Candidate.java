package entity;

import constant.IConstant;
import java.util.List;
import util.Helper;
import util.Validate;

public class Candidate {

    private int id;
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private String phone;
    private String email;
    private int typeCandidate;

    public Candidate() {
    }

    public Candidate(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCandidate = typeCandidate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeCandidate() {
        return typeCandidate;
    }

    public void setTypeCandidate(int typeCandidate) {
        this.typeCandidate = typeCandidate;
    }

    @Override
    public String toString() {
        return String.format("|%-25s|%-10d|%-25s|%-15s|%-30s|%-5d|", firstName
                + lastName, birthDate, address, phone, email, typeCandidate);
    }

    /**
     * @return Return the full name of the candidate
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Tests whether the candidate exist
     *
     * @param list the list of candidate
     * @param id the id to test
     * @return <code>true</code> if candidate exists <code>false</code>
     * otherwise
     */
    private boolean exists(List<Candidate> list, int id) {
        for (Candidate o : list) {
            if (o.getId() == id) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return candidate id
     *
     * @param list the list of candidate
     * @return the integer value is the id of the candidate
     */
    private int getId(List<Candidate> list) {
        do {
            int id = Validate.getInt(
                    "Enter Id: ",
                    "Numeric value out of range",
                    "Invalid integer number!",
                    1, Integer.MAX_VALUE
            );
            if (exists(list, id)) {
                System.out.println("ID is exists, try again. ");
            } else {
                return id;
            }

        } while (true);
    }
    /**
     * Create a candidate
     *
     * @param list the list of candidate
     */
    public void create(List<Candidate> list) {
        this.id = getId(list);
        this.firstName = Validate.getString("Enter FirstName: ", "Invalid FirstName", IConstant.REGEX_NAME);
        this.lastName = Validate.getString("Enter last name: ", "Invalid last name", IConstant.REGEX_NAME);
        this.birthDate = Validate.getInt("Enter birthDate: ", "Numeric value out of range", "Invalid integer number", IConstant.MIN_YEAR, Helper.getCurrentYear());
        this.address = Validate.getString("Enter address: ", "Invalid address", IConstant.REGEX_ADDRESS);
        this.phone = Validate.getString("Enter phone: ", "Invalid phone", IConstant.REGEX_PHONE);
        this.email = Validate.getString("Enter email: ", "Invalid email", IConstant.REGEX_EMAIL);

    }
}
