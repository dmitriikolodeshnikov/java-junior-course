package week_05.day_29_inheritance.src.task_02;

public class Main {
    static void main(String[] args) {
        Student student = new Student("Alex", 22);
        Teacher teacher  =new Teacher("John", 35);

        student.introduce();
        student.study();

        teacher.introduce();
        teacher.teach();
    }
}
