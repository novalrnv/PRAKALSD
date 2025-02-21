package Jobsheet2.sc_code;

public class MataKuliahMain12 {
    public static void main(String[] args) {

        MataKuliah12 RPL = new MataKuliah12();

        RPL.kodemk = "2F02";
        RPL.nama = "Rekayasa Perangkat Lunak";
        RPL.sks = 3;
        RPL.jmlhjam = 100;

        RPL.tampilinformasi();
        RPL.tambahjam(30);
        RPL.kurangijam(60);
        RPL.tampilinformasi();

        MataKuliah12 pancasila = new MataKuliah12("2PC3", "Pancasila", 2, 60);
        pancasila.tampilinformasi();
        pancasila.kurangijam(70);
        pancasila.tampilinformasi();
    }
}
