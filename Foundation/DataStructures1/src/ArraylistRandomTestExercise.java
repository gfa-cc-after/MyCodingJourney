import java.util.ArrayList;

public class ArraylistRandomTestExercise {
    public static void main(String[] args) {


        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(75);



        for (int i = 0; i < grades.size() ; i++) {
            System.out.printf("Grades #%d == %d\n", i, grades.get(i));

        }


    }

}
