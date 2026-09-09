package week_05.day_29_inheritance.src.task_03;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void manageTeam() {
        System.out.println(name + " manage team");
    }
}
