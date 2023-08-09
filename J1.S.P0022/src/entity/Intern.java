package entity;

import constant.IConstant;
import java.util.List;
import util.Validate;

public class Intern extends Candidate {

    private String major;
    private int semester;
    private String university;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate, String major, int semester, String university) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    /**
     * Create an intern candidate
     *
     * @param list the list of candidate
     */
    @Override
    public void create(List<Candidate> list) {
        super.create(list);
        this.major = Validate.getString("Enter major: ", "Invalid major", IConstant.REGEX_TEXT);
        this.semester = Validate.getInt("Enter semester: ", "Numeric value out of range", "Invalid integer number", 1, 100);
        this.university = Validate.getString("Enter university: ", "Invalid university", IConstant.REGEX_TEXT);
        this.setTypeCandidate(IConstant.INTERN_TYPE);
    }
}
