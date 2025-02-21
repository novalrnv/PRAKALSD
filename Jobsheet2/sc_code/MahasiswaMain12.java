package Jobsheet2.sc_code;

public class MahasiswaMain12 {
    public static void main(String[] args) {
        
        Mahasiswa12 mhs1 = new Mahasiswa12();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkaninformasi();
        mhs1.ubahkelas("SI 2K");
        mhs1.updateipk(3.60);
        mhs1.tampilkaninformasi();

    }
}
