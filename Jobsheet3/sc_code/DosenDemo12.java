import java.util.Scanner;

import javax.xml.crypto.Data;

public class DosenDemo12 {
    public static void main(String[] args) {
        Dosen12[] arrayofDosen = new Dosen12[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            arrayofDosen[i] = new Dosen12();
            String dummy;
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode              : ");
            arrayofDosen[i].kode = sc.nextLine();
            System.out.print("Nama              : ");
            arrayofDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin L/P : ");
            dummy = sc.nextLine();
            arrayofDosen[i].jeniskelamin = dummy.equals("L") ? true : false;
            System.out.print("Usia              : ");
            arrayofDosen[i].usia = sc.nextInt();
            System.out.println("-----------------------------");
            sc.nextLine();
        }

        DataDosen12 datadosen12 = new DataDosen12();
        datadosen12.dataSemuaDosen12(arrayofDosen);
        datadosen12.jumlahDosenPerJenisKelamin(arrayofDosen);
        datadosen12.reratausiaDosenPerJenisKelamin(arrayofDosen);
        datadosen12.infoDosenPalingTua(arrayofDosen);
        datadosen12.infoDosenPalingMuda(arrayofDosen);
    }
}
