package com.company;

public class Picture {
    private final Line line1;
    private final Line line2;
    private final HorizontalParabola horizontalParabola;

    public Picture(Line line1, Line line2, HorizontalParabola horizontalParabola) {
        this.line1 = line1;
        this.line2 = line2;
        this.horizontalParabola = horizontalParabola;
    }

    public SimpleColor getColor(double x, double y) {

        if (!horizontalParabola.isPointInside(x, y) && line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }

        if (!horizontalParabola.isPointInside(x, y) && line1.isPointAboveLine(x, y) && !line2.isPointAboveLine(x, y)) {
            return SimpleColor.ORANGE;
        }

        if (!horizontalParabola.isPointInside(x, y) && !line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y)) {
            return SimpleColor.GREY;
        }

        if (horizontalParabola.isPointInside(x, y) && !line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y)) {
            return SimpleColor.GREY;
        }

        if (horizontalParabola.isPointInside(x, y) && line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y)) {
            return SimpleColor.ORANGE;
        }

        if (horizontalParabola.isPointInside(x, y) && line1.isPointAboveLine(x, y) && !line2.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }

        return SimpleColor.YELLOW;
    }
}
