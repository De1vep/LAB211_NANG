package mock;

import entity.Task;
import java.util.ArrayList;

public class Data {

    public static ArrayList<Task> listTaskManager = new ArrayList<Task>() {
        {
            add(new Task(1, 1, "Nguyen Duc Thang", ("11-11-2017"), 8, 17.5, "An", "Chi"));
            add(new Task(2, 2, "Nguyen Duc Hoang", ("11-11-2019"), 8, 17.5, "Huy", "Hoang"));
            add(new Task(3, 3, "Nguyen Duc Huy", ("11-11-2020"), 8, 17.5, "Lam", "Dat"));
            add(new Task(4, 4, "Nguyen Duc Son", ("11-11-2018"), 8, 17.5, "Son", "Anh"));
        }
    };
}
