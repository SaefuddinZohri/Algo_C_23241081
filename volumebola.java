import java.util.Scanner;

public class volumebola {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double phi = 3.14;

        System.out.print("===Menghitung Volume Bola ===\n");
        System.out.println("Masukkan Jari-jari (r) : ");
        r = input.nextDouble();
        System.out.println("Volume Bola : " + (4 * phi * r * r * r)/3);
        
    }
}