public class Dosen12 {
   String kode;
   String nama;
   Boolean jeniskelamin;
   int usia;
   
   public Dosen12() {
       
   }

   public Dosen12(String kode, String nama, Boolean jeniskelamin, int usia) {
    this.kode = kode;
    this.nama = nama;
    this.jeniskelamin = jeniskelamin;
    this.usia = usia;
   }

   void cetakdata() {
    System.out.println("Kode          : "+ kode);
    System.out.println("Nama          : "+ nama);
    System.out.println("Jenis Kelamin : "+ (jeniskelamin ? "Laki-Laki" : "Perempuan"));
    System.out.println("Usia          : "+ usia);
    System.out.println("-----------------------------");
   }
}
