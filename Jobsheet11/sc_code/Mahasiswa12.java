package Jobsheet11.sc_code;

public class Mahasiswa12 {

    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa12(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.println("NIM : " + nim + ", Nama : " + nama + ", Kelas : " + kelas + ", IPK : " + ipk);
    }
}