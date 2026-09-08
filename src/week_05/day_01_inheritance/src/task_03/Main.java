package week_05.day_01_inheritance.src.task_03;

public class Main {
    static void main(String[] args) {
        Developer developer = new Developer("Alex");
        Manager manager = new Manager("Maria");

        developer.work();
        developer.writeCode();

        manager.work();
        manager.manageTeam();
    }



}
