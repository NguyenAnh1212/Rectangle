import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle1 rec1 = new Rectangle1(width,height);
        System.out.println("Your Rectangle \n"+ rec1.display());
        System.out.println("Perimeter of the Rectangle: "+ rec1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rec1.getArea());
    }
}
