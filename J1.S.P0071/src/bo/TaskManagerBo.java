package bo;

import entity.Task;
import java.util.*;
import utility.Validate;

public class TaskManagerBo {

    private final List<Task> list;

    public TaskManagerBo(List<Task> list) {
        this.list = list;
    }

    public List<Task> getTaskList() {
        return list;
    }

    public void addTask() {
        Task task = new Task();
        task.inputTask();
        task.setTaskID(list.get(list.size() - 1).getTaskID() + 1);
        list.add(task);
    }

    public void deleteTask() {
        int taskId = Validate.getInt(
                "ID:",
                "Numeric value out of range!",
                "Invalid integer number!",
                1, Integer.MAX_VALUE);
        for (Task o : list) {
            if (taskId == o.getId()) {
                list.remove(list.indexOf(o));
                System.out.println("Delete successful!");
                return;
            }
        }
        System.out.println("Id is not exist!");
    }

    public void displayTask() {
        if (list.isEmpty()) {
            System.out.println("\nNot Found!");
        } else {
            System.out.format("|%-6s|%-20s|%-13s|%-13s|%-14s|%-13s|%-15s|\n",
                    "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
            list.forEach(System.out::println);
        }
    }
}
