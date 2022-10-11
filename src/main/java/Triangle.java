public class Triangle {
    private int a;
    private int b;
    private int c;


    public Triangle setSides(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;
        return this;
    }

    public Triangle(int a, int b, int c) {
        setSides(a, b, c);
    }

    public boolean isMaxNumbers() {
        return a <= 150000000 && b <= 150000000 && c <= 150000000;
    }

    public boolean isMinNumbers() {
        return a > 0 && b > 0 && c > 0;
    }

    public boolean isTriangle() {
        return (a + b) > c && (b + c) > a && (a + c) > b;
    }

    public boolean isIsoscelesTriangle() {
        return a == b || a == c || b == c;
    }

    public boolean  isEquilateralTriangle(){
        return a == b && a == c;
    }

    public String triangleOfType() {
        String type = "";
        if (isMaxNumbers()) {
            if (isMinNumbers()) {
                if (isTriangle()) {
                    if (isIsoscelesTriangle()) {
                        if (isEquilateralTriangle())
                            type = "The triangle is equilateral";
                        else
                            type ="The triangle is isosceles ";
                    } else
                        type = "The triangle is scalene";
                } else
                    type = " It is not a triangle." + "\n"
                            + " The sum of the lengths of any sides must be greater than the length of the third side";
            } else
                type = "The numbers are incorrect." + "\n"
                        + "The entered number is beyond the limit of the minimum possible value." + "\n"
                        + "Enter data in the range from 1 to Maxinteger (150000000)";
        } else
            type = "The numbers are incorrect." + "\n"
                    + "The entered number is beyond the limit of the maximum possible value." + "\n"
                    + "Enter data in the range from 1 to Maxinteger (150000000)";
        return type;
    }
}
