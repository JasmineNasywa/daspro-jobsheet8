import java.util.Scanner;
public class searchnilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Masukkan jumlah index = ");
        a = sc.nextInt();
        int [] arrnilai = new int [a];

        for (int i = 0; i < arrnilai.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            arrnilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan key = ");
        int key = sc.nextInt();
        int hasil = 0;

        for (int j = 0; j < arrnilai.length; j++) {
            if (key == arrnilai[j]) {
                hasil = j;
                break;
            } if (key != arrnilai[j]){
                System.out.println("Nilai tidak ditemukan");
            }
    
    System.out.println();
    System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
    System.out.println();

    }
} }
