package mock;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import java.util.ArrayList;

/**
 * mock initial data
 */
public class Data {

    public static ArrayList<Candidate> listCandidate = new ArrayList<Candidate>() {
        {

            add(new Experience(1, "Thang", "Nguyen", 1990, "Phu Tho", "0987803161", "ducthang@gmail.com", 0, 10, "coding"));
            add(new Experience(2, "tThang", "Nguyen", 1990, "Phu Tho", "0987803161", "ducthang@gmail.com", 0, 10, "coding"));
            add(new Fresher(2, "Hoang", "Nguyen", 2001, "Bac Ninh", "0987654321", "hoangnk@gmail.com", 1, 2011, "1" , "FPT"));
            add(new Experience(1, "Thang", "Nguyen", 1990, "Phu Tho", "0987803161", "ducthang@gmail.com", 0, 10, "coding"));
            add(new Experience(2, "tThang", "Nguyen", 1990, "Phu Tho", "0987803161", "ducthang@gmail.com", 0, 10, "coding"));
            add(new Fresher(2, "Hoang", "Nguyen", 2001, "Bac Ninh", "0987654321", "hoangnk@gmail.com", 1, 2011, "1" , "FPT"));
        }
    };

}
