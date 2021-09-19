import java.util.*;

public class TransposMatriks {
  public static void main(String[] args){
    int i, j, m, n;
    int matriks[][] = new int[3][3]; 
    int transpose[][] = new int[3][3];

    Scanner input = new Scanner(System.in);

    m = 3;
    n = 3;

    System.out.println("Masukkan elemen matriks: ");
    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        matriks[i][j] = input.nextInt();
      }
    }

    for(i = 0; i < m; i++){
      for(j = 0; j< n; j++){
        transpose[j][i] = matriks[i][j];
      }
    }

    System.out.println("Hasil transpose matriks: ");
    for(i = 0; i < n; i++){
      for(j = 0; j< m; j++){
        System.out.print(transpose[i][j] + "\t");
      }
      System.out.println();
    }
  }
}