package com.company;

public class TestCase {
    private double x, y;
    private SimpleColor color;

    public TestCase(double x, double y, SimpleColor color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public boolean testPoint(SimpleColor color){
        return color == this.color;

    }

    public static boolean testPicture(Picture picture) {
        TestCase testCase1 = new TestCase(1, 3, SimpleColor.GREEN);
        TestCase testCase2 = new TestCase(-1, -8, SimpleColor.ORANGE);
        TestCase testCase3 = new TestCase(-8, 3, SimpleColor.GREY);
        TestCase testCase4 = new TestCase(-8, -1, SimpleColor.GREY);
        TestCase testCase5 = new TestCase(-4, -1, SimpleColor.ORANGE);
        TestCase testCase6 = new TestCase(-3.5, -5.5, SimpleColor.GREEN);
        TestCase testCase7 = new TestCase(-4, 8, SimpleColor.YELLOW);


    }
}

