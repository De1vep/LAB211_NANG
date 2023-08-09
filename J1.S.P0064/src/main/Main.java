package main;

import logic.Validator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====Validate Program=====");
        Validator vl = new Validator();
        
        vl.getPhoneNumber();
        vl.getEmail();
        vl.getDate();
    }
}
