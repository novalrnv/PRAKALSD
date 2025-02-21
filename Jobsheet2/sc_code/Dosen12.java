package Jobsheet2.sc_code;

public class Dosen12 {
    String iddosen;
    String nama;
    boolean status;
    int tahunbergabung;
    String bidang;

    void tampilinformasi() {
        System.out.println("ID : "+iddosen);
        System.out.println("Nama Dosen : "+nama);
        if (status == true){
            System.out.println("Status : Aktif");
        } else {
            System.out.println("Status : Tidak Aktif");
        }
        System.out.println("Tahun Bergabung : "+tahunbergabung);
        System.out.println("Bidang Keahlian : "+bidang);
    }

    void setstatus(boolean sts) {
        if (sts == true) {
            status = sts;
        } else {
            status = sts;
        }
    }

    int hitungmasa(int thnskrg) {
        return thnskrg - tahunbergabung;
    }

    void ubahkeahlian(String keahlian) {
        bidang = keahlian;
    }

    public Dosen12(){
    }

    public Dosen12(String id, String an, boolean status, int tahun, String bdk) {
        iddosen = id;
        nama = an;
        this.status = status;
        tahunbergabung = tahun;
        bidang = bdk;
    }
}
