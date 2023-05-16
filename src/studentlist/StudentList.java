/*
 * @Het Patel
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author Het
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Prompt the user for number of students in class
        Student[] students = new Student[5];

        students[0] = new Student("001", "Het");
        students[1] = new Student("002", "Mary");
        students[2] = new Student("003", "Peter");
        students[3] = new Student("004", "Susan");
        students[4] = new Student("005", "Bob");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getsID() + " " + students[i].getsName());
        }

        // initilize input scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student ID to search: ");
        String ID = input.nextLine();
        int index = -1;
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (ID.equals(students[i].getsID())) {
                System.out.println("Student found: " + students[i].getsName());
                for (int i = 0; i < students.length; i++) {
            if (ID.equals(students[i].getsID())) {
                index = i;
                break;
                
    }

}
