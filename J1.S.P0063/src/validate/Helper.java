package validate;

import entity.Person;

public class Helper {
    public static Person[] sortBySalary(Person[] person) {
        try {
            Person temp;
            for (int i = 0; i < person.length - 1; i++) {
                for (int j = 0; j < person.length - i - 1; j++) {
                    if (person[j].getSalary() > person[j + 1].getSalary()) {
                        temp = person[j];
                        person[j] = person[j + 1];
                        person[j + 1] = temp;
                    }
                }
            }
            return person;
        } catch (Exception ex) {
            throw new NumberFormatException("Can't Sort Person");
        }
    }
}
