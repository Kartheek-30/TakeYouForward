import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nStarTriangle(n);
        sc.close();
    }
    public static void nStarTriangle(int n) {
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n-row-1; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < 2*row+1; col++){
                System.out.print("*");
            }
            for(int col = 0; col < n-row-1; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
