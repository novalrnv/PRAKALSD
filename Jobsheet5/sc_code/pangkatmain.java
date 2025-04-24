import java.util.Scanner;

public class pangkatmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat Bruteforce : ");
        for(pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("Hasil Pangkat Devide and Conquer : ");
        for(pangkat p : png){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}