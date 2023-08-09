package bo;

import constant.IConstant;
import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import java.util.ArrayList;
import java.util.List;
import util.Helper;

/**
 * Candidate business object
 */
public class CandidateBo {

    private final List<Candidate> list;

    public CandidateBo(List<Candidate> list) {
        this.list = list;
    }

    /**
     * Prints the list of candidates by type
     */
    public void display() {
        System.out.println("===========EXPERIENCE CANDIDATE==========");
        for (Candidate o : list) {
            if (o.getTypeCandidate() == 0) {
                
                System.out.println(o.getFullName());
            }
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate o : list) {
            
            if (o.getTypeCandidate() == 1) {
                System.out.println(o.getFullName());
            }
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate o : list) {
            if (o.getTypeCandidate() == 2) {
                System.out.println(o.getFullName());
            }
        }

    }

    /**
     * Add candidate to list
     *
     * @param type type of candidate
     */
    public void add(int type) {
        Candidate candidate = null;
        do {
            switch (type) {
                case IConstant.EXPERIENCE_TYPE:
                    candidate = new Experience();
                    break;
                case IConstant.FRESHER_TYPE:
                    candidate = new Fresher();
                    break;
                case IConstant.INTERN_TYPE:
                    candidate = new Intern();
                    break;
            }
            if (candidate != null) {
                candidate.create(list);
                list.add(candidate);
            } else {
                System.out.println("An error has occured. Can't add new candidate!");
            }
        } while (Helper.isContinue());
    }

    /**
     * Search the candidate in the list
     *
     * @param searchName name to search (first name or last name)
     * @param type type of candidate
     * @return list result searched
     */
    public List<Candidate> search(String searchName, int type) {
        List<Candidate> list = new ArrayList();
        for (Candidate o : this.list) {
            if (o.getFullName().toLowerCase().contains(searchName)) {
                list.add(o);
            }
        }
        return list;
    }

    /**
     * Prints the list result search of candidates
     *
     * @param listResult list candidate to be printed
     */
    public void displayResultSearch(List<Candidate> listResult) {
        if (listResult.isEmpty()) {
            System.out.println("\nNot Found!");
        } else {
            System.out.println("\nThe candidate found: ");
            listResult.forEach(System.out::println);
        }
    }
}
