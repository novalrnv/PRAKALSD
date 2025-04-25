public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;
    
    void tambah(Dosen12 dosen) {
        dataDosen[idx] = dosen;
        idx++;
    }

    void tampil() {
        System.out.println();
        for (Dosen12 d : dataDosen) {
            d.tampil();
            System.out.println("---------------------");
        }
        System.out.println();
    }

    void bubbleSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen12 temp = dataDosen[j - 1];
                    dataDosen[j - 1] = dataDosen[j];
                    dataDosen[j] = temp; 
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen12 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}