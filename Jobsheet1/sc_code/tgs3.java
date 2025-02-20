import java.util.Scanner;
public class tgs3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah MK : ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[jumlahMK], hariKuliah = new String[jumlahMK];
        int[] semester = new int[jumlahMK], sks = new int[jumlahMK];

        for(int i = 0; i < jumlahMK; i++){
            System.out.println("Lengkapi data MK ke-" + (i+1));
            System.out.print(" - Masukkan nama MK ke-" + (i+1) + " : ");
            namaMK[i] = input.nextLine();
            System.out.print(" - Masukkan jumlah SKS MK " + namaMK[i] + " : ");
            sks[i] = input.nextInt();
            System.out.print(" - Masukkan semester MK " + namaMK[i] + " : ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print(" - Masukkan hari MK " + namaMK[i] + " : ");
            hariKuliah[i] = input.nextLine();
        }

        while (true) {
            System.out.println(" ==================================================================");
            System.out.println("|                           MENU PROGRAM                           |");
            System.out.println(" ==================================================================");
            System.out.println("| 1. Program menampilkan seluruh jadwal kuliah                     |");
            System.out.println("| 2. Program menampilkan jadwal kuliah berdasarkan hari            |");
            System.out.println("| 3. Program menampilkan jadwal kuliah berdasarkan semester        |");
            System.out.println("| 4. Program mencari dan menampilkan informasi mata kuliah         |");
            System.out.println("| 5. Keluar                                                        |");
            System.out.println(" ==================================================================");
            System.out.print("Masukkan Menu : ");
            int menu = input.nextInt();
            input.nextLine();
            boolean keluar = false;

            switch (menu) {
                case 1:
                    System.out.println("=============================================");
                    System.out.println("Program menampilkan seluruh jadwal kuliah    |");
                    System.out.println("=============================================");
                    programSatu(namaMK, hariKuliah, sks, semester, jumlahMK);
                    System.out.println("=============================================");

                    break;

                case 2:
                    System.out.println("======================================================");
                    System.out.println("Program menampilkan jadwal kuliah berdasarkan hari    |");
                    System.out.println("======================================================");
                    System.out.print("Masukkan hari : ");
                    String clueHari = input.nextLine();
                    programDua(namaMK, hariKuliah, sks, semester, jumlahMK, clueHari);
                    System.out.println("======================================================");

                    break;

                case 3:
                    System.out.println("===========================================================");
                    System.out.println("Program menampilkan jadwal kuliah berdasarkan semester     |");
                    System.out.println("===========================================================");
                    System.out.print("Masukkan semester : ");
                    int clueSemester = input.nextInt();
                    programTiga(namaMK, hariKuliah, sks, semester, jumlahMK, clueSemester);
                    System.out.println("===========================================================");
                    
                    break;

                case 4:
                    System.out.println("==========================================================");
                    System.out.println("Program mencari dan menampilkan informasi mata kuliah     |");
                    System.out.println("==========================================================");
                    System.out.print("Masukkan nama mata kuliah : ");
                    String clueNamaMK = input.nextLine();
                    programEmpat(namaMK, hariKuliah, sks, semester, jumlahMK, clueNamaMK);
                    System.out.println("==========================================================");
                    
                    break;

                case 5:
                    System.out.println("====================");
                    System.out.println("TERIMA KASIH :)     |");
                    System.out.println("====================");
                    keluar = true;
                    
                    break;
            
                default:
                    System.out.println("========================");
                    System.out.println("Menu tidak terdaftar    |");
                    System.out.println("========================");
                    break;
            }
            if (keluar == true) {
                break;
            }
            input.close();
        }
    }
    static void programSatu(String[] a, String[] b, int[] c, int[] d, int e){
        System.out.printf("%-42s %-6s %-11s %-13s%n","Nama Mata Kuliah","SKS","Semester","Hari Kuliah");
        System.out.printf("%-42s %-6s %-11s %-13s%n","----------------","---","--------","-----------");
        for(int i = 0; i < e; i++){
            System.out.printf("%-42s %-6s %-11s %-13s%n",a[i],c[i],d[i],b[i]);
        }
    }
    static void programDua(String[] a, String[] b, int[] c, int[] d, int e, String f){
        System.out.printf("%-42s %-6s %-11s %-13s%n","Nama Mata Kuliah","SKS","Semester","Hari Kuliah");
        System.out.printf("%-42s %-6s %-11s %-13s%n","----------------","---","--------","-----------");
        for(int i = 0; i < e; i++){
            if (b[i].equalsIgnoreCase(f)) {
                System.out.printf("%-42s %-6s %-11s %-13s%n",a[i],c[i],d[i],b[i]);
            }
        }
    }
    static void programTiga(String[] a, String[] b, int[] c, int[] d, int e, int f){
        System.out.printf("%-42s %-6s %-11s %-13s%n","Nama Mata Kuliah","SKS","Semester","Hari Kuliah");
        System.out.printf("%-42s %-6s %-11s %-13s%n","----------------","---","--------","-----------");
        for(int i = 0; i < e; i++){
            if (d[i] == f) {
                System.out.printf("%-42s %-6s %-11s %-13s%n",a[i],c[i],d[i],b[i]);
            }
        }
    }
    static void programEmpat(String[] a, String[] b, int[] c, int[] d, int e, String f){
        System.out.printf("%-42s %-6s %-11s %-13s%n","Nama Mata Kuliah","SKS","Semester","Hari Kuliah");
        System.out.printf("%-42s %-6s %-11s %-13s%n","----------------","---","--------","-----------");
        for(int i = 0; i < e; i++){
            if (a[i].equalsIgnoreCase(f)) {
                System.out.printf("%-42s %-6s %-11s %-13s%n",a[i],c[i],d[i],b[i]);
            }
        }
    }
}
