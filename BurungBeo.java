import java.util.*;
public class BurungBeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan kata yang ingin diucapkan beo = ");
        String pakDengklek = input.nextLine();
        input.close();

        System.out.println("Beo = "+pakDengklek);
    }
}
