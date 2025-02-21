package Jobsheet2.sc_code;

public class Mahasiswa12 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    
    void tampilkaninformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
        System.out.println("Kelas :" + kelas);
    }
    
    void ubahkelas(String kelasbaru) {
        kelas = kelasbaru;
    }
    
    void updateipk(double ipkbaru) {
        ipk = ipkbaru;
        
        if (ipkbaru <= 0 || ipkbaru >= 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
    
    String nilaikinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public Mahasiswa12(){
    }
    
    public Mahasiswa12(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}