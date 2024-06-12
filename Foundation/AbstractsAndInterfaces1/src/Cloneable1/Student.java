package Cloneable1;

public class Student extends Person implements java.lang.Cloneable {
    //Create a Student class that has the same fields and methods as the Person class,
    // and has the following additional
    //
    //fields:
    //previousOrganization: the name of the student’s previous company / school
    //skippedDays: the number of days skipped from the course
    //methods:
    //getGoal(): prints "Be a junior software developer."
    //introduce(): prints "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays
    // days from the course already."
    //skipDays(numberOfDays): increases skippedDays by numberOfDays
    //The Student class has the following constructors:
    //
    //Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
    //Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life,
    // skippedDays to 0
    String previousOrganization;
    int skippedDays;


    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender );
        this.previousOrganization=previousOrganization;
        this.skippedDays=0;
    }

    public Student(){
        this("Jane Doe",30,"female","The School of Life");
    }

    // functions blabla
    void getGoal(){
        System.out.println("Be a junior software developer");
    }

    void introduce(){
        System.out.println("Hi, Im "+ this.name+" a "+ this.age+" year old "+ this.gender+" from "
        +this.previousOrganization+" who skipped "+this.skippedDays+" from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }



    public Student clone() throws CloneNotSupportedException {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}
