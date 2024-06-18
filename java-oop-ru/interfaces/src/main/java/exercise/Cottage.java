package exercise;

// BEGIN
public class Cottage implements Home/*, Comparable<Cottage>*/ {
    private final double area;
    private final int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    @Override
    public String toString() {
        return this.floorCount + " этажный коттедж площадью "
                + getArea()
                + " метров";
    }

    @Override
    public int compareTo(Home another) {
        /*return Double.compare(getArea(), another.getArea());*/
        var currentArea = this.area;
        var anoterArea = another.getArea();
        if (currentArea > anoterArea) {
            return 1;
        } else if (currentArea < anoterArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
