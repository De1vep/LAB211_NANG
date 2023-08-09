package entity;

import constant.IConstant;
import validate.Validate;

public class Person {

    private String name;
    private String address;
    private double salary;

    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

    public void inputPersonInfo() {
        System.out.println("Input Information of Person");
        //input data 
        name = Validate.getString(
                "Please input name: ",
                "Name must be String",
                IConstant.REGEX_NAME
        );
        address = Validate.getString(
                "Please input address: ",
                "Address must be String",
                IConstant.REGEX_ADDRESS
        );

        while (true) {
            try {
                salary = Validate.getDouble(
                        "Please input salary: ",
                        0, Double.MAX_VALUE
                );
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
