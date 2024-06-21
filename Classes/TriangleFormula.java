package Laboratory;

import java.util.Scanner;

public class TriangleFormula {
    private double base;
    private double height;

    public void inputDimensions() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Base: ");
        base = scn.nextDouble();
        System.out.print("Height: ");
        height = scn.nextDouble();
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }
}
