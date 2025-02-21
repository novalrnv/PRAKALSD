package Jobsheet2.sc_code;

public class MataKuliah12 {
    String kodemk;
    String nama;
    int sks;
    int jmlhjam = 0;

    void tampilinformasi() {
        System.out.println("Kode Mata Kuliah : " + kodemk);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jmlhjam);
    }

    void ubahsks(int sksbaru) {
        sks = sksbaru;
    }

    void tambahjam(int tambah) {
        jmlhjam += tambah;
    }

    void kurangijam(int kurang) {
        if (jmlhjam < kurang) {
            System.out.println("Pengurangan jam tidak dapat dilakukan!");
        } else {
            jmlhjam -= kurang;
        }
    }

    public MataKuliah12() {
    }

    public MataKuliah12 (String code, String nm, int sks, int jumlah) {
        kodemk = code;
        nama = nm;
        this.sks = sks;
        jmlhjam = jumlah;
    }
}
