package exercise;

import lombok.Getter;

// BEGIN
@Getter
public class Circle {
    private Point point;
    private int radius;

    Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.radius < 0) {
            throw new NegativeRadiusException("");
        } else {
            return Math.PI * Math.pow(this.radius, 2);
        }
    }
}
// END
