import java.util.Scanner;

public class percepatan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan posisi awal (meter): ");
        double posisiAwal = input.nextDouble();

        System.out.println("Masukkan posisi akhir (meter): ");
        double posisiAkhir = input.nextDouble();

        System.out.println("Masukkan waktu yang dihabiskan (detik): ");
        double waktu = input.nextDouble();

        double percepatan = hitungPercepatan(posisiAwal, posisiAkhir, waktu);
        double kecepatan = hitungKecepatan(posisiAwal, posisiAkhir, waktu);

        System.out.println("Percepatan rata-rata: " + percepatan + " m/s^2");
        System.out.println("Kecepatan rata-rata: " + kecepatan + " m/s");

    }

    public static double hitungPercepatan(double posisiAwal, double posisiAkhir, double waktu) {
        return (posisiAkhir - posisiAwal) / (waktu * waktu);
    }

    public static double hitungKecepatan(double posisiAwal, double posisiAkhir, double waktu) {
        return (posisiAkhir - posisiAwal) / waktu;
    }
}