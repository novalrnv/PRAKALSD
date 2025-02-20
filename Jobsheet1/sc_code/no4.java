import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tokoBnga[][] = new int[4][4], harga[] = {75000,50000,60000,10000},
        ttlPendapatan[] = new int[4];
        String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
        System.out.println("=======================");
        System.out.println("TOKO BUNGA ROYAL GARDEN");
        System.out.println("=======================");
        for(int i = 0; i < 4; i++){
            System.out.println("Cabang ke-" + (i+1));
            for(int j = 0; j < 4; j++){
                System.out.print(" - Masukkan jumlah bunga " + bunga[j] + " : ");
                tokoBnga[i][j] = input.nextInt();
                input.nextLine();
            }
        }
        while (true) {
            System.out.println("=======================");
            System.out.println(" -----------------------------------------------");
            System.out.println("|                 MENU PROGRAM                  |");
            System.out.println(" -----------------------------------------------");
            System.out.println("| 1. Program Melihat Pendapatan Cabang          |");
            System.out.println("| 2. Program Data Cabang ke-4                   |");
            System.out.println("| 3. Keluar                                     |");
            System.out.println(" -----------------------------------------------");
            System.out.print("Masukkan Menu : ");
            int menu = input.nextInt();
            input.nextLine();
            System.out.println("=======================");
            boolean keluar = false;
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Cabang : ");
                    int cabang = input.nextInt();
                    input.nextLine();
                    if (cabang <= 0 || cabang >= 5) {
                        System.out.println("cabang tidak terdaftar");
                    }else{
                        ttlPendapatan[cabang - 1] = programSatu(tokoBnga, harga, cabang, bunga);
                    }

                    break;
                case 2:
                    System.out.print("Apakah anda ingin merubah data (y/n) ? : ");
                    String add = input.nextLine();
                    int dataADD[] = new int[4];
                    if (add.equalsIgnoreCase("Y")) {
                        for(int i = 0; i < 4; i++){
                            System.out.print("Masukkan jumlah bunga " + bunga[i] + " yg mati : ");
                            dataADD[i] = input.nextInt();
                        }
                    }
                    tokoBnga[3] = programDua(tokoBnga, harga, bunga, dataADD);
                    System.out.println("=======================");
                    break;
                case 3:
                    System.out.println("TERIMA KASIH :)");
                    System.out.println("=======================");
                    keluar = true;
                    break;
            
                default:
                    System.out.println("Menu tidak terdaftar");
                    break;
            }
            if (keluar == true) {
                break;
            }
            input.close();
        }
    }
    static int programSatu(int[][] a, int[] b, int c, String[] d){
        int ttlPendapatan = 0;
        System.out.printf("%-11s %-7s %-8s %-11s%n","BUNGA","STOK","HARGA","TOTAL");
        System.out.printf("%-11s %-7s %-8s %-11s%n","-----","----","-----","-----");
        for(int i = 0; i < 4; i++){
            System.out.printf("%-11s %-7s %-8s %-11s%n",d[i],a[c-1][i],b[i],a[c-1][i] * b[i]);
            ttlPendapatan += a[c-1][i] * b[i];
        }
        System.out.printf("%-5s %-21s %-11s%n"," ","( TOTAL PENDAPATAN ) : ",ttlPendapatan);
        return ttlPendapatan;
    }
    static int[] programDua(int[][] a, int[] b, String[] d, int[] e){
        int[] stokBaru = new int[4];
        for(int i = 0; i < 4; i++){
            stokBaru[i] = a[3][i] - e[i];
        }
        int ttlPendapatan = 0;
        System.out.printf("%-11s %-12s %-7s %-12s %-8s %-11s%n","BUNGA","STOK LAMA","MATI","STOK BARU","HARGA","TOTAL");
        System.out.printf("%-11s %-12s %-7s %-12s %-8s %-11s%n","-----","---------","----","---------","-----","-----");
        for(int i = 0; i < 4; i++){
            System.out.printf("%-11s %-12s %-7s %-12s %-8s %-11s%n",d[i],a[3][i],e[i],stokBaru[i],b[i],stokBaru[i] * b[i]);
            ttlPendapatan += stokBaru[i] * b[i];
        }
        System.out.printf("%-29s %-21s %-11s%n"," ","( TOTAL PENDAPATAN ) : ",ttlPendapatan);
        return stokBaru;
    }
}
