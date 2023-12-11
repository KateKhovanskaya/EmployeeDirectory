package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory empDir= new EmployeeDirectory();
        empDir.addEmployee("Николай", "9752563287", 2);
        empDir.addEmployee("Елена", "94211561324", 5);
        empDir.addEmployee("Петр", "9583651246", 3);
        empDir.addEmployee("Николай", "93125543254", 2);

        System.out.println(empDir.findByExpirience(2));
        System.out.println(empDir.findPhoneByName("Николай"));
        System.out.println(empDir.findByTabNum(2));
    }
}