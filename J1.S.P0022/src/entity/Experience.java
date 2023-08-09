package entity;

import constant.IConstant;
import java.util.List;
import util.Validate;

public class Experience extends Candidate{
    private int expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    /**
     * Create an experience candidate
     *
     * @param list the list of candidate
     */
    @Override
    public void create(List<Candidate> list) {
        super.create(list);
        this.expInYear = Validate.getInt("Enter year of EXP", "Numeric value out of range", "Invalid integer number", 1, 100);
        this.proSkill = Validate.getString("Enter pro skill: ", "Invalid skill", IConstant.REGEX_TEXT);
        this.setTypeCandidate(IConstant.EXPERIENCE_TYPE);
    }
}
