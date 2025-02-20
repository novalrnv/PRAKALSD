import java.util.Scanner;
public class tgs2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {            
            System.out.println(" =================================================");
            System.out.println("|                  MENU PROGRAM                   |");
            System.out.println(" =================================================");
            System.out.println("| 1. Program Menghitung VOLUME KUBUS              |");
            System.out.println("| 2. Program Menghitung LUAS PERMUKAAN KUBUS      |");
            System.out.println("| 3. Program Menghitung KELILING KUBUS            |");  
            System.out.println("| 4. Keluar                                       |");
            System.out.println(" =================================================");
            System.out.print("Masukkan Menu : ");
            int menu = input.nextInt();
            int sisi, volume, luasPermukaan, keliling;
            boolean keluar = false;
            switch (menu) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("Program Menghitung VOLUME KUBUS  |");
                    System.out.println("=================================");
                    System.out.print("Masukkan Panjang sisi KUBUS : ");
                    sisi = input.nextInt();
                    volume = volume(sisi);
                    System.out.println("VOLUME KUBUS ADALAH " + volume);
                    System.out.println("=================================");

                    break;
                
                case 2:
                    System.out.println("=========================================");
                    System.out.println("Program Menghitung LUAS PERMUKAAN KUBUS  |");
                    System.out.println("=========================================");
                    System.out.print("Masukkan Panjang sisi KUBUS : ");
                    sisi = input.nextInt();
                    luasPermukaan = luasPermukaan(sisi);
                    System.out.println("LUAS PERMUKAAN KUBUS ADALAH " + luasPermukaan);
                    System.out.println("=========================================");

                    
                    break;
                
                case 3:
                    System.out.println("===================================");
                    System.out.println("Program Menghitung KELILING KUBUS  |");
                    System.out.println("===================================");
                    System.out.print("Masukkan Panjang sisi KUBUS : ");
                    sisi = input.nextInt();
                    keliling = keliling(sisi);
                    System.out.println("KELILING KUBUS ADALAH " + keliling);
                    System.out.println("===================================");

                    
                    break;

                case 4:
                    System.out.println("===============");
                    System.out.println("TERIMA KASIH :)");
                    System.out.println("===============");
                    keluar = true;
                    
                    break;
                default:
                    System.out.println("======================");
                    System.out.println("MENU TIDAK TERDAFTAR  |");
                    System.out.println("======================");
                    break;
            }
            if (keluar == true) {
                break;
            }
            input.close();
        }
    }
    static int volume(int a){
        int vlm = a * a * a;
        return vlm;
    }
    static int keliling(int a){
        int kllng = 6 * a;
        return kllng;
    }
    static int luasPermukaan(int a){
        int lPermukaan = 6 * (a * a);
        return lPermukaan;
    }
}
