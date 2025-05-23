package sc_code;

import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList12 singLL = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa12 mhs2 = new Mahasiswa12("23212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs4 = new Mahasiswa12("21212203", "Dirga", "4D", 3.6);

        singLL.print();
        singLL.addFirst(mhs4);
        singLL.print();
        singLL.addLast(mhs1);
        singLL.print();
        singLL.insertAfter("Dirga", mhs3);
        singLL.insertAt(2, mhs2);
        singLL.print();

        
        System.out.println("data index 1 : ");
        singLL.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index : " + singLL.indexOf("Bimon"));
        System.out.println();
        
        singLL.removeFirst();
        singLL.removeLast();
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        
        // System.out.print("Masukkan NIM : ");
        // String nim = sc.nextLine();
        // System.out.print("Masukkan Nama : ");
        // String nama = sc.nextLine();
        // System.out.print("Masukkan Kelas : ");
        // String kelas = sc.nextLine();
        // System.out.print("Masukkan IPK : ");
        // double ipk = sc.nextDouble();
        // sc.nextLine();

        // Mahasiswa12 mhsBaru = new Mahasiswa12(nim, nama, kelas, ipk);
    }
}
