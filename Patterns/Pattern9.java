import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nLowerTriangle(n);
        sc.close();
    }
    public static void nLowerTriangle(int n) {
        for(int row = 0; row < n; row++) {
            for(int col = n-row-1; col > 0; col--){
                System.out.print(" ");
            }

            for(int col = 2*row+1; col > 0; col--){
                System.out.print("*");
            }

            for(int col = n-row-1; col > 0; col--){
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int row = n-1; row >= 0; row--) {
            for (int col = 0; col < n-row-1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row+1; col++){
                System.out.print("*");
            }for (int col = 0; col < n-row-1; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
