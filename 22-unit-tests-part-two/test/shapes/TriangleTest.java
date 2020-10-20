package shapes;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

    Triangle simpleTriangle;

    @BeforeClass
    public void init() {
        simpleTriangle = new Triangle(1, 3, 4);
    }

    @Test(timeout = 2)
    public void testCalculatePerimeterWhenSidesPositiveAndNonZeroThenSumOfSides() {
        Triangle triangle = new Triangle(3, 4, 5);
        double expected = 3 + 4 + 5;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("Perimeter calculation is wrong", expected, actual, 0.000001);
    }

    @Test(timeout = 2)
    public void testCalculatePerimeterWhenSidesNegativeAndNonZeroThenZero() {

        //test
        
        Triangle triangle = new Triangle(-3, 4, 5);
        double expected = 0;
        double actual = triangle.calculatePerimeter();

        Assert.assertEquals("Perimeter of non-existant triangle should be zero.", expected, actual, 0.000001);
    }
}
