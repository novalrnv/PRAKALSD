public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

    public void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen12 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen12 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
    void PencarianDataSequential01(String namaCari) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(namaCari)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan nama '" + namaCari + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Data ditemukan lebih dari satu!");
        }
    }
    void PencarianDataBinary(int usiaCari) {
        SortingASC();
        int left = 0;
        int right = idx - 1;
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usiaCari) {
                int temp = mid;
                while (temp >= 0 && dataDosen[temp].usia == usiaCari) {
                    temp--;
                }
                temp++;
                while (temp < idx && dataDosen[temp].usia == usiaCari) {
                    dataDosen[temp].tampil();
                    jumlahDitemukan++;
                    temp++;
                }
                ditemukan = true;
                break;
            } else if (dataDosen[mid].usia < usiaCari) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dengan usia " + usiaCari + " tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu data dengan usia tersebut.");
        }
    }
}