import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTriangle(n);
        sc.close();
    }
    
    public static void nTriangle(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
