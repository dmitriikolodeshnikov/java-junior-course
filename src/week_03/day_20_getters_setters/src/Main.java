package week_03.day_20_getters_setters.src;

public class Main {
    public static void main(String[] args) {
        UserProfile profile = new UserProfile();
        profile.setName("Alex");
        profile.setAge(25);
        profile.setEmail("alex@gmail.com");

        System.out.println(profile.getName());
        System.out.println(profile.getAge());
        System.out.println(profile.getEmail());
    }
}
