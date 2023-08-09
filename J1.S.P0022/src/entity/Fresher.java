package entity;

import constant.IConstant;
import java.util.List;
import util.Helper;
import util.Validate;

public class Fresher extends Candidate {

    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    /**
     * Returns graduationRank
     *
     * @return the string value
     */
    private String getSelectGraduationRank() {
        System.out.println("1. EXCELLENT");
        System.out.println("2. GOOD");
        System.out.println("3. FAIR");
        System.out.println("4. POOR");

        int choice = Validate.getInt(
                "Select graduation Rank: ",
                "Numeric value out of range",
                "Invalid integer number",
                1, 4
        );
        switch (choice) {
            case 1:
                return "EXCELLENT";
            case 2:
                return "GOOD";
            case 3:
                return "FAIR";
            case 4:
                return "POOR";
        }
        return null;
    }

    /**
     * Create a fresher candidate
     *
     * @param list the list of candidate
     */
    @Override
    public void create(List<Candidate> list) {
        super.create(list);
        this.graduationDate = Validate.getInt("EntergraduationDate: ", "Numeric value out of range", "Invalid integer number", IConstant.MIN_YEAR, Helper.getCurrentYear());
        this.graduationRank = getSelectGraduationRank();
        this.education = Validate.getString("Enter education: ", "Invalid education", IConstant.REGEX_TEXT);
        this.setTypeCandidate(IConstant.FRESHER_TYPE);
    }
}
