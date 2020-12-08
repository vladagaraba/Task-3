package ru.vsu.cs.garaba;;

import java.util.Scanner;

public class Main {
    public static String getResult(double x, double y, SimpleColor color) {
        return "X: " + x + "| Y: " + y + "-->" + color;
    }

    public static void main(String[] args) {
        Picture picture = new Picture(
                new Line(-3, -8, -2.5),
                new Line(1, -5, 0),
                new HorizontalParabola(-1, -3, -0.24));
        readCoordinate(picture);
    }

    private static void readCoordinate(Picture picture) {
        if (TestCase.testPicture(picture)) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter X cordinate: ");
            double x = scn.nextDouble();
            System.out.println("\nEnter Y cordinate: ");
            double y = scn.nextDouble();
            System.out.println(getResult(x, y, picture.getColor(x, y)));

        } else System.out.println("Test Failed!");
    }
}
