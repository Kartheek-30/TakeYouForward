import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rightHalfRhombus(n);
        sc.close();
    }

    public static void rightHalfRhombus(int n) {
        for(int row = 0; row < n; row++) {
            for(int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = n-1; row > 0; row--){
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
