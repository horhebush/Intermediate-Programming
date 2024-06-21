package Laboratory;

import java.util.Scanner;

public class CelsiusFormula {
    private double temperature;

    public void inputTemperature() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Celsius: ");
        temperature = scn.nextDouble();
    }

    public void convertToFahrenheit() {
        double fahrenheit = (temperature * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}
