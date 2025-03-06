public class DataDosen12 {
    public void dataSemuaDosen12(Dosen12[] arrayofDosen) {
        System.out.println("--- Data Semua Dosen ---");
        for(Dosen12 dosen : arrayofDosen) {
            dosen.cetakdata();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int lakilaki = 0, perempuan = 0;
        for(Dosen12 dosen : arrayOfDosen) {
            if (dosen.jeniskelamin == true) {
                lakilaki++;
            } else {
                perempuan++;
            }
        }

        System.out.println("--- Data Dosen Per-Jeniskelamin ---");
        System.out.println("Jumlah Dosen Laki-Laki : "+ lakilaki);
        System.out.println("Jumlah Dosen Perempuan : "+ perempuan);
    }

    public void reratausiaDosenPerJenisKelamin (Dosen12[] arrayOfDosen) {
        int totalusiaL = 0, totalusiaP = 0;
        int jmlhlakilaki = 0, jmlhperempuan = 0;

        for(Dosen12 dosen : arrayOfDosen) {
            if (dosen.jeniskelamin == true) {
                jmlhlakilaki ++;
                totalusiaL += dosen.usia;
            } else {
                jmlhperempuan ++;
                totalusiaP += dosen.usia;
            }
        }

        System.out.println("--- Rerata Usia Dosen Per-Jenis Kelamin ---");
        System.out.println("Rata-rata Usia Dosen Laki-Laki  : "+ (jmlhlakilaki > 0 ? (double) totalusiaL/jmlhlakilaki : 0));
        System.out.println("Rata-rata Usia Dosen Perempuan  : "+ (jmlhperempuan > 0 ? (double) totalusiaP/jmlhperempuan : 0));
    }

    public void infoDosenPalingTua(Dosen12[] arrayOfDosen12) {
        if (arrayOfDosen12.length == 0) return;
        
        Dosen12 tertua = arrayOfDosen12[0];
        for (Dosen12 dosen : arrayOfDosen12) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("--- Dosen Paling Tua ---");
        tertua.cetakdata();
    }

    public void infoDosenPalingMuda(Dosen12[] arrayOfDosen12) {
        if (arrayOfDosen12.length == 0) return;
        
        Dosen12 termuda = arrayOfDosen12[0];
        for (Dosen12 dosen : arrayOfDosen12) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("--- Dosen Paling Muda ---");
        termuda.cetakdata();
    }
}
