package Jobsheet13.sc_code;

public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray12() {
        this.dataMahasiswa = new Mahasiswa12[10];
    }

    void populateData(Mahasiswa12 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if (dataMahasiswa[idxStart] != null){
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }

    public void add(Mahasiswa12 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            dataMahasiswa[++idxLast] = data;
        } else {
            System.out.println("Tree penuh");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}