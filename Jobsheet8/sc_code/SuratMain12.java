import java.util.Scanner;

public class SuratMain12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat12 surat = new Surat12(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    Surat12 top = stack.peek();
                    if (top != null) {
                        System.out.println("Surat Terakhir : " + top.namamahasiswa + "\nJenis : " + top.jenisizin);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari : ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 5);
    }
}
