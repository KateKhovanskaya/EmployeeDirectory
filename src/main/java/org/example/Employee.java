package org.example;

public class Employee {
    private static int id;
    private int tabNumber;
    private String firstname;
    private String phone;
    private int experience;
    public Employee(String firstName, String phone, int expirience){
        this.tabNumber = id;
        id++;
        this.firstname = firstName;
        this.phone = phone;
        this.experience = expirience;
    }

    public int getExperience() {
        return experience;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

    public int getTabNumber() {
        return tabNumber;
    }

    @Override
    public String toString() {
        return "{"+tabNumber +
                ", " + firstname +
                ", phone='" + phone + '\'' +
                ", experience=" + experience +
                '}';
    }
}
