package com.company;

public class TestCase {
    private double x, y;
    private SimpleColor color;

    public TestCase(double x, double y, SimpleColor color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public boolean testPoint(SimpleColor color) {
        return color == this.color;
    }

    public static boolean testPicture(Picture picture) {
        TestCase testCase1 = new TestCase(1, 3, SimpleColor.GREEN);
        TestCase testCase2 = new TestCase(-1, -8, SimpleColor.ORANGE);
        TestCase testCase3 = new TestCase(-8, 3, SimpleColor.GREY);
        TestCase testCase4 = new TestCase(-8, -1, SimpleColor.GREY);
        TestCase testCase5 = new TestCase(-4, -1, SimpleColor.ORANGE);
        TestCase testCase6 = new TestCase(-3.5, -5.5, SimpleColor.GREEN);
        TestCase testCase7 = new TestCase(-4, -8, SimpleColor.YELLOW);

        if (!testCase1.testPoint(picture.getColor(testCase1.x, testCase1.y))) return false;
        if (!testCase2.testPoint(picture.getColor(testCase2.x, testCase2.y))) return false;
        if (!testCase3.testPoint(picture.getColor(testCase3.x, testCase3.y))) return false;
        if (!testCase4.testPoint(picture.getColor(testCase4.x, testCase4.y))) return false;
        if (!testCase5.testPoint(picture.getColor(testCase5.x, testCase5.y))) return false;
        if (!testCase6.testPoint(picture.getColor(testCase6.x, testCase6.y))) return false;
        if (!testCase7.testPoint(picture.getColor(testCase7.x, testCase7.y))) return false;

        return true;
    }
}

