import java.util.Scanner;
public class DosenDemo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DataDosen12 data = new DataDosen12();
        Dosen12 d1 = new Dosen12("D1", "Agus", true, 31);
        Dosen12 d2 = new Dosen12("D2", "Aguss", true, 35);
        Dosen12 d3 = new Dosen12("D3", "Cici", false, 22);
        Dosen12 d4 = new Dosen12("D4", "Dedi", true, 45);
        Dosen12 d5 = new Dosen12("D5", "Eka", true, 32);
        Dosen12 d6 = new Dosen12("D6", "Feri", true, 32);
        Dosen12 d7 = new Dosen12("D7", "Gigi", false, 30);
        Dosen12 d8 = new Dosen12("D8", "Hana", false, 28);
        Dosen12 d9 = new Dosen12("D9", "Ika", false, 25);
        Dosen12 d10 = new Dosen12("D10", "Joni", true, 30);

        data.tambah(d1);
        data.tambah(d2);
        data.tambah(d3);
        data.tambah(d4);
        data.tambah(d5);
        data.tambah(d6);
        data.tambah(d7);
        data.tambah(d8);
        data.tambah(d9);
        data.tambah(d10);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia (ASC - Bubble Sort)");
            System.out.println("4. Sorting Usia (DSC - Selection Sort)");
            System.out.println("5. Sorting Usia (DSC - Insertion Sort)");
            System.out.println("6. Cari Nama Dosen (Sequential Search)");
            System.out.println("7. Cari Dosen Berdasarkan Usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (L = Laki-laki / P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');

                    data.tambah(new Dosen12(kode, nama, jenisKelamin, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC (Usia Muda ke Tua)!");
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda) dengan Selection Sort!");
                    break;

                case 5:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda) dengan Insertion Sort!");
                    break;
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.PencarianDataSequential01(cariNama);
                    break;

                case 7:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.PencarianDataBinary(cariUsia);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}