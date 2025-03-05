import java.util.Scanner;

public class Matakuliah12 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    public Matakuliah12(){
        
    }

    public Matakuliah12(String kode, String nama, int sks, int jumlahjam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    public void tambahdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("SKS        : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        jumlahjam = sc.nextInt();
        System.out.println("---------------------------------");
    }

    public void cetakinfo() {
        System.out.println("Kode       : "+ kode);
        System.out.println("Nama       : "+ nama);
        System.out.println("SKS        : "+ sks);
        System.out.println("Jumlah Jam : "+ jumlahjam);
        System.out.println("---------------------------------");
    }
}
