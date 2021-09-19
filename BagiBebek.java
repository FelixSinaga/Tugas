import java.util.*;
public class BagiBebek{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total bebek pak Dengklek = ");
        int totalBebek = input.nextInt();
        System.out.println("Banyak teman pak Dengklek = ");
        int banyakTeman = input.nextInt();
        input.close();
        int bebekDikasih = totalBebek/banyakTeman;
        int sisaBebek = totalBebek%banyakTeman;
        System.out.println("Masing-masing = "+bebekDikasih);
        System.out.println("Bersisa = "+sisaBebek);
    }

}