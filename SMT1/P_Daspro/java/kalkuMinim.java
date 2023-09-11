import java.util.Scanner;
import java.lang.Math;
public class kalkuMinim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double hasil, angka1, angka2;
        char operat;
        System.out.print("input angka pertama : ");
        angka1 = scan.nextDouble();
        System.out.print("input angka kedua   : ");
        angka2 = scan.nextDouble();
        System.out.print("masukan operator    : ");
        operat = scan.next().charAt(0);
        
        
        switch (operat) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '@':
                System.out.println("akar dari " + angka1 + " = " + Math.sqrt(angka1) + 
                                   "\ndan akar dari " + angka2 + " = " + Math.sqrt(angka2));
                break;
            default:
                System.out.println("lu masukin input yang bener babi");
                break;
        }
    
        scan.close();
    }
}