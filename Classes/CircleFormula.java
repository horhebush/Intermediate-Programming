package Laboratory;

import java.util.Scanner;

public class CircleFormula {
    private double radius;

    public void inputRadius() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Radius: ");
        radius = scn.nextDouble();
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area);
    }
}
