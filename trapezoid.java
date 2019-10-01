import java.util.Scanner;


public class trapezoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("\nEnter the top dimension: ");
        double top = in.nextDouble();
        System.out.print("\nEnter the bottom dimension: ");
        double bottom = in.nextDouble();
        System.out.print("\nEnter the height dimension ");
        double height = in.nextDouble();

        double area = (top + bottom) / 2 * height;

        System.out.println("\nThe area of the trapezoid is " + area);




        in.close();
    }
}
