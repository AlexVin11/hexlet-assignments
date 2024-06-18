package exercise;

// BEGIN
public class Flat implements Home/*, Comparable<Flat>*/ {
    private final double area;
    private final double balconyArea;
    private final int floor;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea()
                + " метров" + " на "
                + getFloor()
                + " этаже";
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
