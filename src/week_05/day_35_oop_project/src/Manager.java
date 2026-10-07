package week_05.day_35_oop_project.src;

public class Manager extends Employee {
    private int teamSize;

    public Manager(long id, String name, double salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(
                "Manager " + name + " manages " + teamSize + " employees"
        );
    }
}
