import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nNumberTriangle(n);
        sc.close();
    }
    public static void nNumberTriangle(int n) {
        for(int row = n; row > 0; row--){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
