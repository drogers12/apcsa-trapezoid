import java.util.Scanner;
import java.text.NumberFormat;


public class trapezoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the top dimension: ");
        double top = in.nextDouble();
        System.out.print("Enter the bottom dimension: ");
        double bottom = in.nextDouble();
        System.out.print("Enter the height dimension ");
        double height = in.nextDouble();

        double area = (top + bottom) / 2 * height;

        System.out.print("The area of the trapezoid is ");
        System.out.printf("%.1f\n", area, " is the area of the trapezoid.");

        in.close();
    }
}
