import java.util.Scanner;

public class PhuongTrinhB1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        double a = sc.nextDouble();

        System.out.println("b: ");
        double b = sc.nextDouble();

        System.out.println("c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b==c){
                System.out.println("PT vô số nghiệm");
            }
            else {
                System.out.println("PT Vô Nghiệm");
            }
        }
        else {
            double x = (c - b)/a;
            System.out.printf("Nghiệm của PT x = %f", x);
        }
    }
}
