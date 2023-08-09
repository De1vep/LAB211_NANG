package main;

import entity.Person;
import validate.Helper;
import validate.Validate;

public class Main {

    public static void main(String[] args) {
        int n = Validate.getInt(
                "Enter number student: ",
                "Number student must be a positive number.",
                "Invalid integer number!",
                0, Integer.MAX_VALUE);
        Person[] list = new Person[n];
        for (int i = 0; i < n; i++) {
            Person person = new Person();
            person.inputPersonInfo();
            list[i] = person;
        }
        Helper.sortBySalary(list);
        System.out.println("======Information of Person you have entered======");
        for (Person o : list) {
            o.displayPersonInfo();
            System.out.println("======================");
        }
    }
}
