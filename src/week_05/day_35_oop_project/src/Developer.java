package week_05.day_35_oop_project.src;

public class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(long id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println("Developer " + name + " writes " + programmingLanguage + " code");
    }

    @Override
    public void generateReport() {
        System.out.println("Developer report: " + name);
    }

}
