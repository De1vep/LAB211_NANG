/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import constant.IConstant;
import java.util.ArrayList;
import util.Validate;


/**
 *
 * @author Tu
 */
public class Student implements Comparable<Student> {
    private String name;
    private float mark;
    private String classes;

    public Student() {
    }

    public Student(String name,String classes, float mark) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void input(ArrayList<Student> list){
        System.out.println("Please input student information");
        name = Validate.getString("Name: ", "Not empty", "Wrong format", IConstant.REGEX_NAME);
        classes = Validate.getString("Classes: ", "Not empty", "Wrong format", IConstant.REGEX_CLASSES);
        mark = Validate.getFloat("Mark: ", "Number out of bound", "Wrong number format", 1, Float.MAX_VALUE);
        list.add(new Student(name, classes, mark));
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Classes:" + classes);
        System.out.println("Mark: " + mark);
    }
    
    
    @Override
    public int compareTo(Student t) {
        return this.name.compareTo(t.name);
    } 
}
