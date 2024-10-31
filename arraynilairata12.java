import java.util.Scanner;
public class arraynilairata12 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Masukkan jumlah mahasiswa-");
    a = sc.nextInt();
    int [] nilaimhs = new int [a];
    double total = 0;
    double rata2;

    

    for (int i = 0; i < nilaimhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilaimhs[i] = sc.nextInt();
    }
    for (int i = 0; i < nilaimhs.length; i++) {
        total += nilaimhs[i];
        
    }
    int j = 0;
    for (int i = 0; i < nilaimhs.length; i++) {
        if (nilaimhs[i] > 70) {
            j++;
        }
    }
    rata2 = total/nilaimhs.length;
    System.out.println(("Rata-rata nilai = " + rata2));
    System.out.println("Jumlah mahasiswa yang lulus adalah " + j);
   } 
}
