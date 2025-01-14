
package ifelse;
   import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap toan: ");
        double toan = scanner.nextDouble();
        System.out.print("nhap ly: ");
        double ly = scanner.nextDouble();
        System.out.print("nhap hoa: ");
        double hoa = scanner.nextDouble();

        double average = (toan + ly + hoa) / 3;

        if (average >= 8) {
            System.out.println("XUẤT SẮC");
        } else if (average >= 6.5) {
            System.out.println("GIỎI");
        } else if (average >= 5) {
            System.out.println("TB");
        } else {
            System.out.println("Kém");
        }
    }
}
 
