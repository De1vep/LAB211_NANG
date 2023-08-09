/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import constant.IConstant;
import entity.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import util.Validate;

/**
 *
 * @author Tu
 */
public class ManageEastAsiaCountries {
    private final ArrayList<EastAsiaCountries> list;

    /**
     * Initialize object
     */
    public ManageEastAsiaCountries() {
        list = new ArrayList<>();
    }
    
    /**
     * Add information
     */
    public void add(){
        EastAsiaCountries ea = new EastAsiaCountries();
        ea.input(list);
    }
    
    public void display(){
        System.out.println(String.format("%-15s%-15s%-15s%-15s",
                "ID", "Name", "Total Area", "Terrain"));
        for (EastAsiaCountries ea : list) {
            ea.display();
        }
    }
    
    /**
     * Search one country by user-entered name
     */
    public void search(){
        String name = Validate.getString(
                "Enter the name you want to search for: ",
                "Not empty",
                "Wrong format",
                IConstant.REGEX_LETTERS
        );
        
        for (EastAsiaCountries ea : list) {
            if(ea.getCountryName().equalsIgnoreCase(name)){
                System.out.println(String.format("%-15s%-15s%-15s%-15s",
                        "ID", "Name", "Total Area", "Terrain"));
                ea.display();
                return;
            }
        }
    }
    
    /**
     * Display country by sorted name in ascending order
     */
    public void displaySortedInfo(){
        Collections.sort(list);
        display();
    }
    
}
