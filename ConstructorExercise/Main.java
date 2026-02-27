/*

* Name: Aidan Shewfelt
* Date: 02/27/2026
* Name: Java Constructor Exercise
* Summary: A constructor-focused object-oriented programming project demonstrating:
- Java class design
- Constructor overloading
- Encapsulation.

 */

public class Main {
    public static void main(String[] args) {

        // Creates an array of objects
        Student[] students = new Student[4];

        // Student information creation
        students[0]=new Student("Spongebob", 30, 3.2, true, "Culinary Arts");
        students[1]=new Student("Patrick", 34, false, "Business");
        students[2]=new Student("Sandy", 27, 4.0, true, "Molecular Science");
        students[3]=new Student("Ugene", true, "Business");

        // Printing Attributes
        System.out.println("---Student Roster---");

        for (int i=0; i<students.length; i++) { students[i].printStudent(i+1); }
    }
}