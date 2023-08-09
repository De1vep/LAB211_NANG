package bo;

import entity.Contact;
import java.util.List;
import util.Validate;

public class ContactBo {

    private final List<Contact> list;

    public List<Contact> getList() {
        return list;
    }

    public ContactBo(List<Contact> list) {
        this.list = list;
    }

    public void addContact() {
        Contact contact = new Contact();
        contact.inputContactInfo();
        contact.setId(list.get(list.size() - 1).getId() + 1);
        list.add(contact);
    }

    public void display() {
        System.out.printf("|%-5s|%-25s|%-15s|%-15s|%-10s|%-15s|%-15s|\n",
                "Id", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (Contact o : list) {
            String txt[] = o.getFullName().split(" ", 2);
            String firstName = txt[0];
            String lastName = txt[1];
            System.out.println(
                    String.format("|%-5d|%-25s|%-15s|%-15s|%-10s|%-15s|%-15s|",
                            o.getId(), o.getFullName(), firstName, lastName,
                            o.getGroup(), o.getAddress(), o.getPhone()));
        }
    }

    public void deleteContact() {
        int taskId = Validate.getInt(
                "ID: ",
                "Numeric value out of range",
                "Invalid integer number!",
                1, Integer.MAX_VALUE);
        for (Contact o : list) {
            if (taskId == o.getId()) {
                list.remove(list.indexOf(o));
                System.out.println("Delete successful!");
                return;
            }
        }
        System.out.println("Id is not exist!");
    }
}
