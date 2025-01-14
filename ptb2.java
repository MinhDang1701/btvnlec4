
package ifelse;
   import java.util.Scanner;

public class ptb2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap  b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap  c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
          
            if (b == 0) {
                if (c == 0) {
                    System.out.println("pt vsn");
                } else {
                    System.out.println("pt vn");
                }
            } else {
                double x = -c / b;
                System.out.println("pt 1 nghiem " + x);
            }
        } else {
        
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
               
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("pt 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
              
                double x = -b / (2 * a);
                System.out.println("pt nghiemkep x=" + x);
            } else {
           
                System.out.println("Pt vn");
            }
        }

        scanner.close();
    }
}


