import java.util.Scanner;
public class tugas2job9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargatotal = 0;

        System.out.print("Masukkan jumlah pesanan yang akan di pesan : ");
        int a = sc.nextInt();
        String[] pesanan = new String[a];
        int [] harga = new int [a];
        
        
        for (int i = 0; i < a; i++){
            System.out.print("Masukkan pesanan = ");
            pesanan[i] = sc.nextLine();
        }

        for (int i = 0; i < a; i++) {
            System.out.println("Masukkan harga " + pesanan[i] + "=");
            harga[i] = sc.nextInt();
            hargatotal += harga[i];
        }
        
        System.out.println("-------------- Struk belanja -------------");
        for (int i = 0; i < a; i++){
            System.out.println("Pasanan " + pesanan[i] + " seharga Rp. " + harga[i]);
        }
        System.out.println("Total harga yang harus di bayar adalah Rp." + hargatotal);
        System.out.println("Terimaksih sudah berkunjung.");

    }
}
