import java.util.*;
public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai alas segitiga = ");
        int alasSegitiga = input.nextInt();
        System.out.println("Masukkan nilai tinggi segitiga = ");
        int tinggiSegitiga = input.nextInt();
        input.close();
        double luasSegitiga = alasSegitiga*tinggiSegitiga;
        double luasSegitiga1 = luasSegitiga/2;
        System.out.println("luas segitiga = "+luasSegitiga1);
    }
}
