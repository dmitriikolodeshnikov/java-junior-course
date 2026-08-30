package week_02.day_13_string.src;

public class Main {
    static int getLength(String text) {
        return text.length();
    }
    static String toUpperCase(String text) {
        return text.toUpperCase();
    }
    static String toLowerCase(String text) {
        return text.toLowerCase();
    }
    static boolean containsJava(String text) {
        return text.contains("Java");
    }

    static boolean containsBackend(String text) {
        return text.contains("Backend");
    }

    public static void main(String[] args) {
        String text = "Java Backend Developer";
        System.out.println("Length: " + getLength(text));
        System.out.println("Uppercase: " + toUpperCase(text));
        System.out.println("Lowercase: " + toLowerCase(text));
        System.out.println("Contains Java: " + containsJava(text));
        System.out.println("Contains Backend: " + containsBackend(text));
    }
}
