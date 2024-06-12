package CONSTRUCOTorExplainedHERE;

public class Human {

    String name;
    int age;
    double weight;

        //THIS BELOW IS CONSTRUCTOR - WONT WORK WITHOUT THIS.
        Human(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drinking(){
        System.out.println(this.name+ " is drinking *burp*");
    }
}
