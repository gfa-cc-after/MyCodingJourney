package Cloneable1;

public class Person {

    //name: the name of the person
    //age: the age of the person (whole number)
    //gender: the gender of the person (male / female)
    //And the following methods:
    //
    //getGoal(): prints "My goal is: Live for the moment!"
    //introduce(): prints "Hi, I'm name, a age year old gender."
    //And the following constructors:
    //
    //Person(name, age, gender)
    //Person(): sets name to Jane Doe, age to 30, gender to female
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public Person(){
        this("Jane Doe",30,"female");
    }


    // functions blabla

    void getGoal() {
        System.out.println("My goal is: Live for a moment!");
    }

    void introduce(){
        System.out.println("Hi, Im "+ this.name+" a "+ this.age+" year old "+ this.gender+".");
    }
}
