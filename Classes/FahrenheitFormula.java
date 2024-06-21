package Laboratory;

import java.util.Scanner;

public class FahrenheitFormula {
    private double temperature;

    public void inputTemperature() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        temperature = scn.nextDouble();
    }

    public void convertToCelsius() {
        double celsius = (temperature - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }
}
