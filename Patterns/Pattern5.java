import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seeding(n);
        sc.close();
    }
    public static void seeding(int n) {
        for(int row = n; row > 0; row--){
            for(int col = 1; col <= row; col ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
