import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest extends MainTest {

    @DataProvider(name = "possibleInteger")
    public Object[][] possibleInteger() {
        return new Object[][]{
                {triangle.setSides(1001, 100, 100).isMaxNumbers(), true},
                {triangle.setSides(100, -1, 200).isMaxNumbers(), true},
                {triangle.setSides(100, 200, 0).isMaxNumbers(), true},
                {triangle.setSides(100, 150000001, 200).isMaxNumbers(), false},
                {triangle.setSides(1, 1, 1).isMaxNumbers(), true},
                {triangle.setSides(2, 2, 1).isMaxNumbers(), true},
                {triangle.setSides(150000000, 140000000, 130000000).isMaxNumbers(), true},
                {triangle.setSides(1001, 100, 100).isMinNumbers(), true},
                {triangle.setSides(100, -1, 200).isMinNumbers(), false},
                {triangle.setSides(100, 200, 0).isMinNumbers(), false},
                {triangle.setSides(100, 150000001, 200).isMinNumbers(), true},
                {triangle.setSides(1, 1, 1).isMinNumbers(), true},
                {triangle.setSides(2, 2, 1).isMinNumbers(), true},
                {triangle.setSides(150000000, 140000000, 130000000).isMinNumbers(), true}
        };
    }

    @DataProvider(name = "triangleData")
    public Object[][] triangleData() {
        return new Object[][]{
                {triangle.setSides(1001, 100, 100).isTriangle(), false},
                {triangle.setSides(100, -1, 200).isTriangle(), false},
                {triangle.setSides(100, 200, 0).isTriangle(), false},
                {triangle.setSides(100, 150000001, 200).isTriangle(), false},
                {triangle.setSides(1, 1, 1).isTriangle(), true},
                {triangle.setSides(2, 2, 1).isTriangle(), true},
                {triangle.setSides(150000000, 140000000, 130000000).isTriangle(), true}
        };
    }



    @DataProvider(name = "isoscelesTriangleData")
    public Object[][] isoscelesTriangleData() {
        return new Object[][]{
                {triangle.setSides(1001, 100, 100).isIsoscelesTriangle(), true},
                {triangle.setSides(100, -1, 200).isIsoscelesTriangle(), false},
                {triangle.setSides(100, 200, 0).isIsoscelesTriangle(), false},
                {triangle.setSides(100, 150000001, 200).isIsoscelesTriangle(), false},
                {triangle.setSides(1, 1, 1).isIsoscelesTriangle(), true},
                {triangle.setSides(2, 2, 1).isIsoscelesTriangle(), true},
                {triangle.setSides(150000000, 140000000, 130000000).isIsoscelesTriangle(), false}
        };
    }

    @DataProvider(name = "equilateralTriangleData")
    public Object[][] equilateralTriangleData() {
        return new Object[][]{
                {triangle.setSides(1001, 100, 100).isEquilateralTriangle(), false},
                {triangle.setSides(100, -1, 200).isEquilateralTriangle(), false},
                {triangle.setSides(100, 200, 0).isEquilateralTriangle(), false},
                {triangle.setSides(100, 150000001, 200).isEquilateralTriangle(), false},
                {triangle.setSides(1, 1, 1).isEquilateralTriangle(), true},
                {triangle.setSides(2, 2, 1).isEquilateralTriangle(), false},
                {triangle.setSides(150000000, 140000000, 130000000).isEquilateralTriangle(), false}
        };
    }

    @Test(dataProvider = "possibleInteger")
    public void testIsPossibleIntegerTest(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                "The result is not an expected");
    }

    @Test(dataProvider = "triangleData")
    public void testIsTriangleExist(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle does%s exist.", expectedResult ? " not": ""));
    }

    @Test(dataProvider = "isoscelesTriangleData")
    public void testIsIsoscelesTriangle(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle is%s equilateral.", expectedResult ? " not" : ""));
    }

    @Test(dataProvider = "equilateralTriangleData")
    public void testIsEquilateralTriangle(boolean actualResult, boolean expectedResult) {
        assertEquals(actualResult, expectedResult,
                String.format("The triangle is%s equilateral.", expectedResult ? " not" : ""));
    }


}