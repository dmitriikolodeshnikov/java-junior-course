package week_02.day_12_method_overloading.src;

public class Main {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;

    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit -32) * 5 / 9;

    }

    static double kmToMile(double km) {
        return km * 0.621371;
    }
    static double mileToKm(double mile) {
        return mile * 1.60934;
    }

    public static void main(String[] args) {
        System.out.println("20 C = " + celsiusToFahrenheit(20) + " F");
        System.out.println("68 F = " + fahrenheitToCelsius(68) + " C");

        System.out.println("10 km = " + kmToMile(10) + " miles");
        System.out.println("5 miles = " + mileToKm(5) + " km");
    }
}
