import java.util.Scanner;

public class StudiKasus1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian = 0, kurang = 0;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = scanner.nextInt();

        scanner.close();
    }
}