
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas : ");
        Double nilaiTgs = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        Double nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        Double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        Double nilaiUAS = input.nextDouble();
        System.out.println("======================");
        System.out.println("======================");
        Double nilaiAkhir = 0.0, bobotNilai = 0.0;
        String nilaiHrf = "A", stasus = "LULUS";


        if (nilaiKuis > 100 || nilaiKuis < 0 || nilaiTgs > 100 || nilaiTgs < 0 || nilaiUTS > 100 || nilaiUTS < 0 || nilaiUAS> 100 || nilaiUAS < 0 ) {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }else{
            nilaiAkhir = (nilaiTgs * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
            if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                nilaiHrf = "A";
                bobotNilai = 4.0;
            }else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                nilaiHrf = "B+";
                bobotNilai = 3.5;
            }else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                nilaiHrf = "B";
                bobotNilai = 3.0;
            }else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                nilaiHrf = "C+";
                bobotNilai = 2.5;
            }else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                nilaiHrf = "C";
                bobotNilai = 2.0;
            }else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                nilaiHrf = "D";
                bobotNilai = 1.0;
            }else if (nilaiAkhir <= 39) {
                nilaiHrf = "E";
                bobotNilai = 0.0;
            }

            if (nilaiHrf.equals("D") || nilaiHrf.equals("E")) {
                stasus = "TIDAK LULUS";
            }

            System.out.println("Nilia Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHrf);
            System.out.println("Bobot Nilai : " + bobotNilai);
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("ANDA " + stasus);
            input.close();
        }
    }
}
