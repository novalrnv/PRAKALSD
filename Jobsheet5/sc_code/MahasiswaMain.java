public class MahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaList = new Mahasiswa[8];
        mahasiswaList[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mahasiswaList[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mahasiswaList[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mahasiswaList[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mahasiswaList[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mahasiswaList[5] = new Mahasiswa("Fajar", "220101006", 2023, 88, 85);
        mahasiswaList[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mahasiswaList[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        int nilaiUTSTertinggi = Mahasiswa.nilaiUTSTertinggi(mahasiswaList);
        System.out.println("Nilai UTS tertinggi: " + nilaiUTSTertinggi);

        int nilaiUTSTerendah = Mahasiswa.nilaiUTSTerendah(mahasiswaList);
        System.out.println("Nilai UTS terendah: " + nilaiUTSTerendah);

        double rataRataUAS = Mahasiswa.rataRataUAS(mahasiswaList);
        System.out.println("Rata-rata UAS: " + rataRataUAS);
    }
}
