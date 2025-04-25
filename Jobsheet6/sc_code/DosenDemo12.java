public class DosenDemo12 {
    public static void main(String[] args) {
        DataDosen12 list = new DataDosen12();
    
        Dosen12 d1 = new Dosen12("101", "Joko", true, 35);
        Dosen12 d2 = new Dosen12("102", "Adam", true, 28);
        Dosen12 d3 = new Dosen12("103", "Yani", false, 24);
        Dosen12 d4 = new Dosen12("104", "Ahmad", true, 26);
        Dosen12 d5 = new Dosen12("105", "Yanti", false, 26);
        Dosen12 d6 = new Dosen12("106", "Diana", false, 25);
        Dosen12 d7 = new Dosen12("107", "Jeka", true, 29);
        Dosen12 d8 = new Dosen12("108", "Ana", false, 31);
        Dosen12 d9 = new Dosen12("109", "Samid", true, 39);
        Dosen12 d10 = new Dosen12("110", "Lily", false, 27);
        
        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("----- Menampilkan Semua Data Dosen -----");
        list.tampil();

        System.out.println("----- Menampilkan Data Dosen dari Termuda ke Tertua -----");
        list.bubbleSort();
        list.tampil();

        System.out.println("----- Menampilkan Data Dosen dari Tertua ke Termuda -----");
        list.insertionSort();
        list.tampil();
        
    }
}