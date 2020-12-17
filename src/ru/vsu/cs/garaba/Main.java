package ru.vsu.cs.garaba;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Picture picture = new Picture(
                new Line(-3, -8, -2.5),
                new Line(1, -5, 0),
                new HorizontalParabola(-1, -3, -0.24));
        testPicture(picture);

        startProgram(picture, testPicture(picture));
    }

    private static double readDouble(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter coordinate %s ", name);
        return scn.nextDouble();
    }

    private static void printTestResult(SimpleColor color, SimpleColor correctColor, Point point, String testResult) {
        System.out.println("*---------------\nX: " + point.getX() + " | Y: " + point.getY() + " -> " + color +
                "\nCorrect color: " + correctColor + " | " + testResult + "\n---------------*\n");
    }

    private static void printColorForPoint(Point point, SimpleColor color) {
        System.out.println("X: " + point.getX() + " | Y: " + point.getY() + " -> " + color);
    }

    private static boolean testPicture(Picture picture) {
        TestCase[] testCases = {
                new TestCase(1, 3, SimpleColor.GREEN),
                new TestCase(-1, -8, SimpleColor.ORANGE),
                new TestCase(-8, 3, SimpleColor.GREY),
                new TestCase(-8, -1, SimpleColor.GREY),
                new TestCase(-4, -1, SimpleColor.ORANGE),
                new TestCase(-3.5, -5.5, SimpleColor.GREEN),
                new TestCase(-4, -8, SimpleColor.YELLOW)
        };

        boolean result = true;

        Point point;
        SimpleColor color;
        SimpleColor correctColor;

        for (int i = 0; i < testCases.length; i++) {
            point = new Point(testCases[i].getX(), testCases[i].getY());
            color = picture.getColor(point);
            correctColor = testCases[i].getColor();

            if (checkColor(correctColor, color)) {
                printTestResult(color, correctColor, point, "\u001B[32m" + "TRUE" + "\u001B[0m");
            } else {
                printTestResult(color, correctColor, point, "\u001B[31m" + "FALSE" + "\u001B[0m");
                result = false;
            }
        }

        return result;
    }

    private static boolean checkColor(SimpleColor correctColor, SimpleColor testColor) {
        return correctColor == testColor;
    }

    private static void startProgram(Picture picture, boolean testResult) {
        if (!testResult) {
            System.out.println("\u001B[31m" + "PROGRAM IS WORKING INCORRECTLY" + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "PROGRAM IS WORKING CORRECTLY" + "\u001B[0m");
            double x = readDouble("X: ");
            double y = readDouble("Y: ");

            Point point = new Point(x, y);
            SimpleColor color = picture.getColor(point);

            printColorForPoint(point, color);
        }
    }
}
