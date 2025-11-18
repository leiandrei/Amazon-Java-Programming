import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculating the Area of the Rectangle");

        System.out.print("Enter Width: ");
        float w = scan.nextFloat();

        System.out.print("Enter Height: ");
        float h = scan.nextFloat();

        Rectangle rct = new Rectangle(w, h, "Red");

        rct.funcDraw();
        System.out.println("Area of Rectangle: " + rct.fltCalculateArea());

        System.out.println("Calculating Area of Circle");

        System.out.print("Enter radius: ");
        float r = scan.nextFloat();

        Circle cr = new Circle(r, "Blue");

        cr.funcDraw();
        System.out.println("Area: "+ cr.fltCalculateArea());

        scan.close();

    }
}
