import java.util.*;
public class Bebek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah bebek jantan = ");
        int bebekJantan = input.nextInt();
        System.out.println("Masukkan jumlah bebek betina = ");
        int bebekBetina = input.nextInt();
        input.close();

        int totalBebek = bebekJantan + bebekBetina;

        System.out.println("total bebek pak Dengklek = "+totalBebek);
    }
}
