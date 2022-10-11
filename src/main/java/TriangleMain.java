
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Enter a number for the first side of the triangle." + "\n "
                    + "The numeric range should be from Mininteger = 1 to Maхinteger = 150000000:");
            int firstTriangleSide = scanner.nextInt();
            System.out.println(" Enter a number for the second side of the triangle." + "\n "
                    + "The numeric range should be from Mininteger = 1 to Maхinteger = 150000000:");
            int secondTriangleSide = scanner.nextInt();
            System.out.println(" Enter a number for the third side of the triangle." + "\n "
                    + "The numeric range should be from Mininteger = 1 to Maхinteger = 150000000:");
            int thirdTriangleSide = scanner.nextInt();
            String type = new Triangle(firstTriangleSide, secondTriangleSide, thirdTriangleSide).triangleOfType();
            System.out.println(type);
        } catch (InputMismatchException e) {
            System.out.println(" The entered data is not a number." + "\n "
                    + "Enter data in the range from 1 to Maxinteger (150000000)" );
        }
        int i3 = 0;
        String str2 = "203955";
        try {
            i3 = Integer.parseInt(str2);
            System.out.println(i3);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }

}
