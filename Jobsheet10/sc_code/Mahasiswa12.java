package sc_code;
public class Mahasiswa12 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa12(){

    }

    public Mahasiswa12(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}