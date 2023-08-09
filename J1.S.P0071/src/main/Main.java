package main;

import bo.TaskManagerBo;
import utility.Validate;
import mock.Data;

public class Main {

    public static void main(String[] args) {
        TaskManagerBo manager = new TaskManagerBo(Data.listTaskManager);
        int choice;
        while (true) {
            System.out.println("========================================");
            System.out.println("|             Task Program             |");
            System.out.println("========================================");
            System.out.println("|\t1. Add Task                    |");
            System.out.println("|\t2. Delete Task                 |");
            System.out.println("|\t3. Display Task                |");
            System.out.println("|\t4. Exit                        |");
            System.out.println("========================================");
            choice = Validate.getInt(
                    "Enter your choice:",
                    "Numeric value out of range!",
                    "Invalid integer number!",
                    1, 4
            );
            switch (choice) {
                case 1:
                    System.out.println("-------Add Task---------");
                    manager.addTask();
                    break;
                case 2:
                    System.out.println("-------Del Task---------");
                    manager.deleteTask();
                    break;
                case 3:
                    System.out.println("-------Display   Task---------");
                    manager.displayTask();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
