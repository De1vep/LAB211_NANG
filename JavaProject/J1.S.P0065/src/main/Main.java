/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.ManageStudent;

/**
 *
 * @author Tu
 */
public class Main {
    public static void main(String[] args) {
        ManageStudent ms = new ManageStudent();
        ms.input();
        ms.displayStudentInfo();
        ms.calculatePercentTypeStudent();
        ms.displayPercentType();
    }
}
