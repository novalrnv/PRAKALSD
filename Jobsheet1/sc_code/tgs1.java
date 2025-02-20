import java.util.Scanner;;
public class tgs1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kode[] = {'A','B','D','E','F','G','H','L','N','T'};
        char kota[][]={
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','A','N','G'},
            {'T','E','G','A','L'}
        };
        System.out.print("Masukkan kode plat : ");
        char plat = input.nextLine().charAt(0);
        System.out.println("====================");
        int index = 0;
        for(int i = 0; i < kode.length; i++){
            if (Character.toUpperCase(plat) == kode[i]) {
                index = i;
                break;
            }
        }
        System.out.print("KOTA : ");
        for(int i = 0; i < kota[index].length; i++){
            System.out.print(kota[index][i]);
        }
        input.close();
    }
}
