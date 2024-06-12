import java.util.ArrayList;


public class ArrayListRandomTestExercise2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Mohamed Alami");
        names.add("Oliver Miller");

        names.add(2, "Jack Adams");
        names.set(0, "John Adams");

        for (int i = 0; i < names.size() ; i++) {

            System.out.println(names.get(i));
        }


    }
}
