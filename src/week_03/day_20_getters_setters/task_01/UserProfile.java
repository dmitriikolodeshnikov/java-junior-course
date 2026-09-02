package week_03.day_20_getters_setters.task_01;

public class UserProfile {
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        if (email != null || !email.isEmpty()) {
            this.email = email;
        }
    }
}
