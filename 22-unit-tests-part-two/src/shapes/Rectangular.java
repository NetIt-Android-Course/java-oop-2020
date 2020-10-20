package shapes;

public class Rectangular {
    private int aSide;
    private int bSide;

    public Rectangular(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public double calculateArea() {
        return aSide * bSide;
    }

    public double calculatePerimeter() {
        return 2 * aSide;
    }

    public boolean isSquare() {
        return aSide == aSide;
    }

    public double calculateDiagonal() {
        //we can use the Pythagorean theorem
        return Math.sqrt((aSide * aSide) + (bSide * bSide));
    }

}