import java.util.Scanner;;
public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah MK : ");
        int jumlahMK = input.nextInt();
        input.nextLine();
        String[] namaMK = new String[jumlahMK], nilaiHrf = new String[jumlahMK];
        Double[] nilai = new Double[jumlahMK], bbtNilai = new Double[jumlahMK], bbtSKS = new Double[jumlahMK];
        Double ttlSKS = 0.0, ttlNilai = 0.0;
        
        for(int i = 0; i < jumlahMK; i++){
            System.out.println("Mata kuliah ke-" + (i+1));
            System.out.print(" - Masukkan Nama MK ke-" + (i+1) + " : ");
            namaMK[i] = input.nextLine();
            System.out.print(" - Masukkan Nilai MK ke-" + (i+1) + " : ");
            nilai[i] = input.nextDouble();
            System.out.print(" - Masukkan jumlah SKS MK ke-" + (i+1) + " : ");
            bbtSKS[i] = input.nextDouble();
            input.nextLine();
        }
        for(int i = 0; i < jumlahMK; i++){
            if (nilai[i] <= 100 && nilai[i] > 80) {
                nilaiHrf[i] = "A";
                bbtNilai[i] = 4.0;
            }else if (nilai[i] <= 80 && nilai[i] > 73) {
                nilaiHrf[i] = "B+";
                bbtNilai[i] = 3.5;
            }else if (nilai[i] <= 73 && nilai[i] > 65) {
                nilaiHrf[i] = "B";
                bbtNilai[i] = 3.0;
            }else if (nilai[i] <= 65 && nilai[i] > 60) {
                nilaiHrf[i] = "C+";
                bbtNilai[i] = 2.5;
            }else if (nilai[i] <= 60 && nilai[i] > 50) {
                nilaiHrf[i] = "C";
                bbtNilai[i] = 2.0;
            }else if (nilai[i] <= 50 && nilai[i] > 39) {
                nilaiHrf[i] = "D";
                bbtNilai[i] = 1.0;
            }else if (nilai[i] <= 39) {
                nilaiHrf[i] = "E";
                bbtNilai[i] = 0.0;
            }
            ttlNilai += (bbtSKS[i] * bbtNilai[i]);
            ttlSKS += bbtSKS[i];
        }
        Double IP = ttlNilai / ttlSKS;
        String ipBlat = String.format("%.2f", IP); 
        System.out.println("==============================");
        System.out.println("hasil konversi nilai");
        System.out.println("==============================");
        System.out.printf("%-42s %-13s %-13s %-13s %-5s%n", "Mata Kuliah","Nilai Angka","Nilai Huruf","Bobot Nilai","SKS");
        for(int i = 0; i < jumlahMK; i++){   
            System.out.printf("%-42s %-13s %-13s %-13s %-5s%n", namaMK[i],nilai[i],nilaiHrf[i],bbtNilai[i],bbtSKS[i]);
        }
        System.out.println("==============================");
        System.out.println("IP : " + ipBlat);
        input.close();
    }
}
