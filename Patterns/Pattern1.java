import java.util.Scanner;

public class Pattern1{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number for printing the forest: ");
        int n = num.nextInt();
        System.out.println("Here is your forest");
        System.out.println();
        nForest(n);

        num.close();
    }
    public static void nForest(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}