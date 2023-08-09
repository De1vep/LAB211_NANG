/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import util.Validate;

/**
 *
 * @author Tu
 */
public class ManageStudent {

    private final ArrayList<Student> list;

    /**
     * Method to initialize object
     */
    public ManageStudent() {
        list = new ArrayList<>();
    }

    /**
     * Method to add student
     */
    public void add() {
        System.out.println("===== Collection Sort Program =====");
        Student st = new Student();
        do {
            st.input(list);
        } while (Validate.checkYN(
                "Do you want to enter more student information?(Y/N):",
                "Not null",
                "Must enter Y or N"
        ));
    }

    /**
     * Method to sort student list
     */
    public void sortStudent(){
        Collections.sort(list);
    }
    
    /**
     * Method to display list student
     */
    public void display(){
        for(int i = 0; i<list.size();i++){
            System.out.println("-------------Student " + (i+1)+ "-------------");
            list.get(i).display();
        }
    }
}
