import java.util.Scanner;

public class Pattern8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nRightHalfDiamond(n);
        sc.close();
    }
    public static void nRightHalfDiamond(int n) {
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = n-1; row > 0; row--){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}