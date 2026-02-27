/*

* Student.java
* A simple constructor exercise demonstrating:
- Constructor overloading and chaining.
- Optional fields with Integer/Double.
- Encapsulation through the use of private fields.
- Formatted output of student data and summaries.
- Structured and clean code.

*/

public class Student {
    // Initialize values
    private String name, program;
    private Integer age;
    private Double gpa;
    private boolean isAttending;

    Student(String name, Integer age, Double gpa, boolean isAttending, String program) {
        // 'this' refers to the object that is currently being created.
        this.name=name;
        this.age=age;
        this.gpa=gpa;
        this.isAttending=isAttending;
        this.program=program;
    }

    Student(String name, Integer age, boolean isAttending, String program) { this(name, age, null, isAttending, program); }

    Student(String name, boolean isAttending, String program) { this(name, null, null, isAttending, program); }

    // toString will student overview, then it will print the student summary (a sentence explaining the overview).

    void printStudent(int currentStudent) {
        // Printing Overview

        //These values will be the Integers/Doubles/bools, represented as strings.
        String gpaString, ageString, isAttendingString;

        // Checks if GPA is provided then sets GPA string.
        if (gpa!=null) { gpaString=String.valueOf(gpa); }  else { gpaString="No GPA Data Provided."; }

        // Checks if age is provided then sets age string
        if (age!=null) { ageString=String.valueOf(age); } else { ageString="No Age Data Provided."; }

        // Checks if student is attending or a drop out thens ets the attendance string
        if (isAttending) { isAttendingString="Yes"; } else { isAttendingString="No"; }

        //Prints out the actual student summary.
        System.out.print("---Student "+(currentStudent)+"---\nName: "+name+"\n"+"Age: "+ageString+"\n"+"GPA: "+gpaString+"\n"+"Attending (Y/N): "+isAttendingString+"\n");

        // After the overview is printed, then it will print the summary.

        //Sets GPA string to be printed.
        if (gpa!=null) { gpaString=", with a GPA of: "+gpa+"."; }  else { gpaString=", with no GPA data provided."; }

        // Setting attendance status string to be printed.
        if (isAttending) { isAttendingString="is studying "; } else { isAttendingString="dropped out. When attending, they were studying "; }

        // Sets age string to be printed.
        if (this.age!=null) { ageString=" ("+age+") "; }  else { ageString=" (No Age Data Provided) "; }

        // Prints out summary
        System.out.println("Student Summary: " + name + ageString + isAttendingString + program + gpaString + "\n");
    }
}
