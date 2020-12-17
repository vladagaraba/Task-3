package ru.vsu.cs.garaba;

public class Picture {
    private final Line line1;
    private final Line line2;
    private final HorizontalParabola horizontalParabola;

    public Picture(Line line1, Line line2, HorizontalParabola horizontalParabola) {
        this.line1 = line1;
        this.line2 = line2;
        this.horizontalParabola = horizontalParabola;
    }

    public SimpleColor getColor(Point point) {

        if (!horizontalParabola.isPointInside(point.getX(), point.getY()) && line1.isPointAboveLine(point.getX(), point.getY()) && line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.GREEN;
        }

        if (!horizontalParabola.isPointInside(point.getX(), point.getY()) && line1.isPointAboveLine(point.getX(), point.getY()) && !line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.ORANGE;
        }

        if (!horizontalParabola.isPointInside(point.getX(), point.getY()) && !line1.isPointAboveLine(point.getX(), point.getY()) && line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.GREY;
        }

        if (horizontalParabola.isPointInside(point.getX(), point.getY()) && !line1.isPointAboveLine(point.getX(), point.getY()) && line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.GREY;
        }

        if (horizontalParabola.isPointInside(point.getX(), point.getY()) && line1.isPointAboveLine(point.getX(), point.getY()) && line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.ORANGE;
        }

        if (horizontalParabola.isPointInside(point.getX(), point.getY()) && line1.isPointAboveLine(point.getX(), point.getY()) && !line2.isPointAboveLine(point.getX(), point.getY())) {
            return SimpleColor.GREEN;
        }

        return SimpleColor.YELLOW;
    }
}
