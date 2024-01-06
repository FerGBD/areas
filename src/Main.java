import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C, triangle, circle, trapeze, square, rectangle;

        System.out.print("Type the first value:");
        A = sc.nextDouble();
        System.out.print("Type the second value:");
        B = sc.nextDouble();
        System.out.print("Type the third value:");
        C = sc.nextDouble();

        triangle = (A * C) / 2;
        circle = C * C * 3.14159;
        trapeze = (A + B) * C / 2;
        square =  B * B;
        rectangle = A * B;

        System.out.printf("The area of the triangle is: %.3f%n", triangle);
        System.out.printf("The area of the circle is: %.3f%n", circle);
        System.out.printf("The area of the trapeze is: %.3f%n", trapeze);
        System.out.printf("The area of the square is: %.3f%n", square);
        System.out.printf("The area of the rectangle is: %.3f%n", rectangle);

        sc.close();

    }
}