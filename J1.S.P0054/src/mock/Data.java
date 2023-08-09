package mock;

import entity.Contact;
import java.util.ArrayList;

public class Data {

    public static ArrayList<Contact> listContact = new ArrayList<Contact>() {
        {
            add(new Contact(1, "Iker Casillas", "Star", "Spain", "1234567890"));
            add(new Contact(2, "John Terry", "Star", "England", "1234567890"));
            add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890"));
        }
    };
}
