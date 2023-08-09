/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import constant.IConstant;
import entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import util.Validate;

/**
 *
 * @author Tu
 */
public class ManageStudent {
    
    private final ArrayList<Student> array;
    private final HashMap<String, Double> getPercentTypeStudent;

    public ManageStudent() {
        array = new ArrayList<>();
        getPercentTypeStudent = new HashMap<>();
    }
    
    public void input(){
        System.out.println("====== Management Student Program ======");
        do{
            Student st = new Student();
            st.input();
            array.add(st);
        }while(countinue());
    }
    
    public void calculatePercentTypeStudent() {
        int totalStudent = array.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        for (int i = 0; i < totalStudent; i++) {
            if (array.get(i).getType() == 'A') {
                typeA++;
            }
            if (array.get(i).getType() == 'B') {
                typeB++;
            }
            if (array.get(i).getType() == 'C') {
                typeC++;
            }
            if (array.get(i).getType() == 'D') {
                typeD++;
            }
        }
        getPercentTypeStudent.put("A", typeA / totalStudent * 100);
        getPercentTypeStudent.put("B", typeB / totalStudent * 100);
        getPercentTypeStudent.put("C", typeC / totalStudent * 100);
        getPercentTypeStudent.put("D", typeD / totalStudent * 100);
    }
    
    public void displayStudentInfo(){
        int i = 0;
        for (Student st : array) {
            System.out.println("------ Student " + (++i) + " info ------");
            st.displayInfo();
        }
    }
    
    public void displayPercentType(){
        System.out.println("---------Classification Info---------");
        for (Map.Entry student : getPercentTypeStudent.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue() + "%");
        }
    }

    private boolean countinue() {
        String result = Validate.getString(
                "Do you want to enter more student information?(Y/N):",
                "Please choose y or n", 
                IConstant.REGEX_YES_NO);
        return result.equalsIgnoreCase("Y");
    }
}
