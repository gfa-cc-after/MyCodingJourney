package TeacherStudent8;

public class Student {



    public static void learn() {
        System.out.println("the student is actually learning");
    }

    public  void question(Teacher teacher1) {
        System.out.println("The student is asking");
        Teacher.giveAnswer();
    }
}
