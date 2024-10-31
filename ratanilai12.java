import java.util.Scanner;
public class ratanilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;
        
        for (i=1; i<=5 ; i++) {
            totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke - " + i);
            for (j=1;j<=5;j++) {
                System.out.print(("Nilai ke-" + j + " = "));
                nilai = sc.nextInt();
                totalNilai += nilai;

            } rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai mahasiwa ke-" + i + "adalah " + rataNilai);
        } 

        
        }
        
        

    }

