import java.util.Scanner;
public class tugas3job9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int k = 0;

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Daftar makanan :");
        System.out.println("Nasi Goreng\nMie Goreng\nRoti Bakar\nKentang Goreng\nTeh Tarik\nCappucino\nChocolate Ice");
        System.out.print("Masukkan pesanan yang akan dicari =");
        String key = sc.nextLine();

        for (int j = 0; j < menu.length; j++) {

            if (key.equalsIgnoreCase(menu[j])) {
                 k = 1;
                 System.out.println("Pesanan ditemukan");
                break;
            } 
            if (!key.equalsIgnoreCase(menu[j])){
                k = 2;
                
                
            } 
        } 
        if (k == 2) {
              System.out.println("Pesanan tidak ditemukan");
            
        }
    
}}
