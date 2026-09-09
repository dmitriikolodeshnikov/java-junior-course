package week_05.day_30_super_override.src;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name,
                     int age,
                     double salary,
                     String programmingLanguage
    ) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void work() {
        System.out.println(name + " writes " + programmingLanguage + " code");
    }
}
