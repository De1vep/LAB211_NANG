package entity;

import constant.IConstant;
import util.Validate;

public class Contact {

    private int id;
    private String fullName;
    private String group;
    private String address;
    private String phone;

    public Contact() {
    }

    public Contact(int id, String fullName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("|%-5d|%-25s|%-10s|%-15s|%-15s|",
                id, fullName, group, address, phone);
    }
    
    public void inputContactInfo() {
        fullName = Validate.getString(
                "input name: ",
                "invalid name!",
                IConstant.REGEX_NAME
        );
        group = Validate.getString(
                "input group: ",
                "invalid group!",
                IConstant.REGEX_NAME
        );
        address = Validate.getString(
                "input address: ",
                "invalid address!",
                IConstant.REGEX_ADDRESS
        );
        phone = Validate.getString(
                "Input phone: ",
                "Please input phone flow: "
                + "\n• 1234567890"
                + "\n• 123-456-7890"
                + "\n• 123-456-7890 x1234"
                + "\n• 123-456-7890 ext1234"
                + "\n• (123)-456-7890"
                + "\n• 123.456.7890"
                + "\n• 123 456 7890",
                IConstant.REGEX_PHONE
        );
    }
}
