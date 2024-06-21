package Laboratory;

import java.util.Scanner;

public class Activity5 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        while (true) {
            System.out.println("\n\tMachine Problem\t\n");
            System.out.println("\t\t[A] Circle Formula\t");
            System.out.println("\t\t[B] Triangle Formula\t");
            System.out.println("\t\t[C] Temperature Formula\t");
            System.out.println("\t\t[X] Exit\t");

            char x = Default();

            switch (x) {
                case 'A':
                case 'a':
                    CircleFormula circle = new CircleFormula();
                    circle.inputRadius();
                    circle.calculateArea();
                    break;
                case 'B':
                case 'b':
                    TriangleFormula triangle = new TriangleFormula();
                    triangle.inputDimensions();
                    triangle.calculateArea();
                    break;
                case 'C':
                case 'c':
                    TemperatureMenu();
                    break;
                case 'X':
                case 'x':
                    MethodX();
                    return;
            }
        }
    }

    public static void TemperatureMenu() {
        while (true) {
            System.out.println("\n\t\t[A] Fahrenheit to Celsius\t");
            System.out.println("\t\t[B] Celsius to Fahrenheit\t");
            System.out.println("\t\t[X] Menu\t\n");

            char x = Default();

            switch (x) {
                case 'A':
                case 'a':
                    FahrenheitFormula fahrenheit = new FahrenheitFormula();
                    fahrenheit.inputTemperature();
                    fahrenheit.convertToCelsius();
                    break;
                case 'B':
                case 'b':
                    CelsiusFormula celsius = new CelsiusFormula();
                    celsius.inputTemperature();
                    celsius.convertToFahrenheit();
                    break;
                case 'X':
                case 'x':
                    return;
            }
        }
    }

    public static void MethodX() {
        System.out.println("\n\tThank you for using Machine Problem");
        System.out.println("\t\t    Have a good one. Good bye!");
    }

    public static char Default() {
        char x;
        System.out.print("\nSelect Option: ");
        x = scn.next().charAt(0);

        while (x != 'A' && x != 'B' && x != 'C' && x != 'X' &&
                x != 'a' && x != 'b' && x != 'c' && x != 'x') {
            System.out.println("\nInvalid Input\n");
            System.out.print("Select Option: ");
            x = scn.next().charAt(0);
        }

        return x;
    }
}
