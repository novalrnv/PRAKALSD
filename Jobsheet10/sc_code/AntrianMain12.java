package sc_code;
import java.util.Scanner;

public class AntrianMain12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("== Program Antrian Mahasiswa ==");
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int maxSize = sc.nextInt();
        LinkedListAntrian12 antrian = new LinkedListAntrian12(maxSize);
        int pilihan;
        do {
            System.out.println("\n== Menu Antrian Mahasiswa ==");
            System.out.println("1. Tampilkan Seluruh Antrian");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Panggil Mahasiswa");
            System.out.println("4. Tampil Terdepan");
            System.out.println("5. Tampil Terbelakang");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Tampil Jumlah Mahasiswa Mengantri");
            System.out.println("0. Keluar");
            System.out.print("> Pilihan: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    antrian.tampilkanAntrian();
                    break;
                case 2:
                    sc.nextLine();
                    Mahasiswa data = inputData();
                    antrian.tambahAntrian(data);
                    break;
                case 3:
                    antrian.panggilAntrian();
                    break;
                case 4:
                    antrian.tampilTerdepan();
                    break;
                case 5:
                    antrian.tampilBelakang();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    System.out.println("Jumlah Mahasiswa Mengantri: " + antrian.getSize());
                    break;
                case 0:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan != 0);
    }

    static Mahasiswa inputData() {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        return new Mahasiswa(nim, nama, kelas, ipk);
    }
}
