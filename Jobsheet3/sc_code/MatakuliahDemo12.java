import java.util.Scanner;

public class MatakuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama;
        int sks, jumlahjam;

        System.out.print("Masukkan Jumlah Matakuliah : ");
        int lengthmatkul = sc.nextInt();
        Matakuliah12[] arrayOfMatakuliah = new Matakuliah12[lengthmatkul];

        for (int i = 0; i < arrayOfMatakuliah.length; i++){
            System.out.println("Masukkan Data Matakuliah ke-"+ (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah12();
            arrayOfMatakuliah[i].tambahdata();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-"+ (i + 1));
            arrayOfMatakuliah[i].cetakinfo();
        }
    }
}
