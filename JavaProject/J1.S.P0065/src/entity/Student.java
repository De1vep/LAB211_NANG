/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import constant.IConstant;
import util.Validate;

/**
 *
 * @author Tu
 */
public class Student {
    
    private String name;
    private String classes;
    private double maths;
    private double chemistry;
    private double physics;
    private double average;
    private char type;

    public Student() {
    }

    public Student(String name, String classes, double maths, double chemistry,
            double physics, double average, char type) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
        this.average = average;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    
    

    public void input(){
        name = Validate.getString(
                "Name:",
                "Wrong format",
                IConstant.REGEX_NAME);
        classes = Validate.getString(
                "Classes:",
                "Wrong format",
                IConstant.REGEX_CLASSES);
        maths = Validate.getDouble(
                "Maths:",
                "Maths is greater than equal zero",
                "Maths is less than equal ten", 
                "Maths is digit", 
                0, 10);
        chemistry = Validate.getDouble(
                "Chemistry:",
                "Chemistry is greater than equal zero",
                "Chemistry is less than equal ten", 
                "Chemistry is digit", 
                0, 10);
        physics = Validate.getDouble(
                "Physics:",
                "Physics is greater than equal zero",
                "Physics is less than equal ten", 
                "Physics is digit", 
                0, 10);
    }
    
    public void getTypeMark(){
        average = (maths + chemistry + physics)/3;
        if(average > 7.5){
            type = 'A';
        }
        if(average >= 6 && average <= 7.5){
            type = 'B';
        }
        if(average >= 4 && average < 6){
            type = 'C';
        }
        if(average < 4){
            type = 'D';
        }
    }
    
    public void displayInfo(){
        getTypeMark();
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
        System.out.println("AVG: " + average);
        System.out.println("Type: " + type);
    }
}
