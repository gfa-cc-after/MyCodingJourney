package GreenFoxInheritanceExercise1;


import java.util.ArrayList;

public class Cohort {

    String cohortName;

    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    //// CONSTRUCTOR + BUT ONLY did this.cohortName=name
    public Cohort(String name) {
        this.cohortName = name;     // STRING AUTOFILL happ
        this.students = new ArrayList<>(); // this i had to figure out
        this.mentors = new ArrayList<>(); // this too
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The "+this.cohortName+" cohort has "+ students.size()+" students and "
                +mentors.size()+" mentors.");
    }

}
