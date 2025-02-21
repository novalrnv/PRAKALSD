package Jobsheet2.sc_code;

public class DosenMain12 {
    public static void main(String[] args) {
        
        int tahun;

        Dosen12 dik = new Dosen12();
        
        dik.iddosen = "236743";
        dik.nama = "Andika";
        dik.status = true;
        dik.tahunbergabung = 2022;
        dik.bidang = "RPL";

        tahun = dik.hitungmasa(2025);
        dik.tampilinformasi();
        dik.ubahkeahlian("Matematika");
        dik.tampilinformasi();
        System.out.println("Masa Kerja : "+tahun+" tahun");

        Dosen12 hab = new Dosen12("257898", "Habibi", false, 2021, "Daspro");
        hab.tampilinformasi();
    }
}
