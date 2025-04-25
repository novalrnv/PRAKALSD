class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int getNilaiUTS() {
        return nilaiUTS;
    }

    int getNilaiUAS() {
        return nilaiUAS;
    }

    static int nilaiUTSTertinggi(Mahasiswa[] mahasiswaList) {
        int tertinggi = mahasiswaList[0].getNilaiUTS();
        for (Mahasiswa m : mahasiswaList) {
            if (m.getNilaiUTS() > tertinggi) {
                tertinggi = m.getNilaiUTS();
            }
        }
        return tertinggi;
    }

    static int nilaiUTSTerendah(Mahasiswa[] mahasiswaList) {
        int terendah = mahasiswaList[0].getNilaiUTS();
        for (Mahasiswa m : mahasiswaList) {
            if (m.getNilaiUTS() < terendah) {
                terendah = m.getNilaiUTS();
            }
        }
        return terendah;
    }

    static double rataRataUAS(Mahasiswa[] mahasiswaList) {
        int totalUAS = 0;
        for (Mahasiswa m : mahasiswaList) {
            totalUAS += m.getNilaiUAS();
        }
        return (double) totalUAS / mahasiswaList.length;
    }
}