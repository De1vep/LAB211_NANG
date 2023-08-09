package main;

import bo.ContactBo;
import mock.Data;
import util.Validate;

public class Main {

    public static void main(String[] args) {
        int choice;
        ContactBo cb = new ContactBo(Data.listContact);
        while (true) {
            System.out.println("=====Contact Program=====");
            System.out.println("1. Add a contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.println("==========================");
            choice = Validate.getInt(
                    "Please enter your choice from 1 to 4:",
                    "Out of range!",
                    "Choice must be a digit!",
                    1, 4);
            switch (choice) {
                case 1:
                    System.out.println("-------Add Task---------");
                    cb.addContact();
                    break;
                case 2:
                    System.out.println("-------Display Task---------");
                    cb.display();
                    break;
                case 3:
                    System.out.println("-------Del Task---------");
                    cb.deleteContact();
                    break;
                case 4:
                    return;
            }
        }
    }
}
