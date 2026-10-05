import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = scanner.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = scanner.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = scanner.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            
            System.out.print("Peringkat juara : ");
            peringkatJuara = scanner.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap (4 dokumen). Penghargaan diberikan (Juara " + peringkatJuara + ").");
                } else {
                    System.out.println("Status : Dokumen lengkap (4 dokumen). Penghargaan tidak diberikan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        }
    scanner.close();
    }
}