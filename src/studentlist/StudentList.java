package studentlist;

import java.util.Scanner;

/*
 * @Het Patel
 */
public class StudentList {

    // hello this is a comment.
    // ROLL BACK COMMENT
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("001", "Het");
        students[1] = new Student("002", "Mary");
        students[2] = new Student("003", "Peter");
        students[3] = new Student("004", "Susan");
        students[4] = new Student("005", "Bob");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getsID() + " " + students[i].getsName());
        }

    }

}
