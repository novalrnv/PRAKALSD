
public class MahasiswaBerprestasi12 {
    int elemen;
    Mahasiswa12[] listMhs;
    int idx;
    MahasiswaBerprestasi12(int elm){
        this.elemen = elm;
        listMhs = new Mahasiswa12[elm];
    }

    void tambah(Mahasiswa12 m){
        if (idx < elemen) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa12 m : listMhs){
            m.tampilInformasi();
            System.out.println("-----------------");
        }
    }

    int sequntialSarching(double cari){
        int posisi = -1;
        for(int i = 0; i < elemen; i++){
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampillDatasearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }else{
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan di index " + pos);
        }else{
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk){
                return (mid);
            }else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid - 1);
            }else{
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}