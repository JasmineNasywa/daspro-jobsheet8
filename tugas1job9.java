import java.util.Scanner;
public class tugas1job9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double rataRata;
    int nilaiTotal = 0;
    int tertinggi = 0;
    int terendah = 100;

    System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int a = sc.nextInt();
        int[] nilaiMhs = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah){
                terendah = nilaiMhs[i];
            }
            nilaiTotal += nilaiMhs[i];

        } 
        
            
        
        rataRata = nilaiTotal/a;
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        


} } 
