import java.util.Scanner;
public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long nim = input.nextLong();
        System.out.println("======================");
        long n = nim % 100;
        if (n > 10) {
            n += 10;
        }
        System.out.println("n : " + n);
        for(int i = 1; i <= n; i++){
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            }else{
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}

