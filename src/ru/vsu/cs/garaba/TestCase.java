package ru.vsu.cs.garaba;

public class TestCase {
    private double x, y;
    private SimpleColor color;

    public TestCase(double x, double y, SimpleColor color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public SimpleColor getColor() {
        return color;
    }
}
