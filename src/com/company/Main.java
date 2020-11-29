package com.company;

public class Main {

    public static void main(String[] args) {
	Picture picture = new Picture(
	        new Line(-3, -8, -2.5),
            new Line(1, -5, 0),
            new HorizontalParabola(-1, -5, -0.24));
        System.out.println(picture.getColor(-3, -5.3));
    }

}
