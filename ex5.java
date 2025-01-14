/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifelse;
    import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int ngay = scanner.nextInt();

        switch (ngay) {
            case 1:
                System.out.println("chu nhat");
                break;
            case 2:
                System.out.println("t2");
                break;
            case 3:
                System.out.println("t3");
                break;
            case 4:
                System.out.println("t4");
                break;
            case 5:
                System.out.println("t5");
                break;
            case 6:
                System.out.println("t6");
                break;
            case 7:
                System.out.println("t7");
                break;
            default:
                System.out.println("khong hop le");
        }
    }
}

