package GreenFoxInheritanceExercise1;

public class Sponsor extends Person{

    String company;
    int hiredStudents;
    public Sponsor(String name, int age, String gender,String company) {
        super(name, age, gender);

        this.company=company;
        this.hiredStudents=0;

    }

    public Sponsor(){
        this("Jane Doe",30,"female","Google");
    }

    // functions blabla
    void introduce() {
        System.out.println("Hi im "+ this.name+", a"+this.age+" years old "+ this.gender+" who " +
                "represents "+this.company+ " and hired "+this.hiredStudents+" students so far.");
    }

    void hire(){
        hiredStudents++;
    }

    void getGoal(){
        System.out.println("Hire brilliant junior software developers");
    }




}
