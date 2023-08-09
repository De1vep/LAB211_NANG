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
public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {

    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName,
            float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public void input(ArrayList<EastAsiaCountries> list) {
        countryCode = Validate.getString(
                "Enter code of country:",
                "Not empty",
                "Wrong format",
                IConstant.REGEX_LETTERS
        );

        countryName = Validate.getString(
                "Enter name of country: ",
                "Not empty",
                "Wrong format",
                IConstant.REGEX_LETTERS
        );

        totalArea = Validate.getFloat(
                "Enter total Area:",
                "Number out of bound",
                "Wrong number format",
                0, Float.MAX_VALUE
        );

        countryTerrain = Validate.getString(
                "Enter terrain of country:",
                "Not empty",
                "Wrong format",
                IConstant.REGEX_LETTERS
        );
        list.add(new EastAsiaCountries(countryCode, countryName,
                totalArea, countryTerrain));
    }

    @Override
    public void display() {
        super.display();
        System.out.println(String.format("%-15s", countryTerrain));
    }

    @Override
    public int compareTo(EastAsiaCountries t) {
        return countryName.compareTo(t.getCountryName());
    }
}
