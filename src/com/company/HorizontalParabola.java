package com.company;

public class HorizontalParabola {
    private double x0;
    private double y0;
    private double a;

    public HorizontalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointInside(double x, double y) {
        if (a > 0) {
            return x >= a * Math.pow(y - y0, 2) + x0;
        } else {
            return x <= a * Math.pow(y - y0, 2) + x0;
        }
    }
}