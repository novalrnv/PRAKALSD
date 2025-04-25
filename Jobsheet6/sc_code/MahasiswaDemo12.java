import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();

        // System.out.print("Masukkan NIM : ");
        // String nim = sc.next();
        // System.out.print("Masukkan Nama : ");
        // String nama = sc.next();
        // System.out.print("Masukkan Kelas : ");
        // String kelas = sc.next();
        // System.out.print("Masukkan IPK : ");
        // double ipk = sc.nextDouble();
        // Mahasiswa12 m = new Mahasiswa12(nim, nama, kelas, ipk);
        // list.tambah(m);

        Mahasiswa12 m1 = new Mahasiswa12("123", "Zidan", "2A", 3.7);
        Mahasiswa12 m2 = new Mahasiswa12("124", "Ayu", "2A", 3.0);
        Mahasiswa12 m3 = new Mahasiswa12("125", "Sofi", "2A", 3.8);
        Mahasiswa12 m4 = new Mahasiswa12("126", "Sita", "2A", 3.1);
        Mahasiswa12 m5 = new Mahasiswa12("127", "Miki", "2A", 3.4);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
