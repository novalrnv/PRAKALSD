public class Dosen12 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen12 (String kode, String name, boolean jk, int usia) {
        this.kode = kode;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil () {
        System.out.println("Nama          : " + nama);
        System.out.println("Kode          : " + kode);
        System.out.println("Jenis Kelamin : " + (jenisKelamin == true ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
    }
}