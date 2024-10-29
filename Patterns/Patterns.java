import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();
    }

    public static void pattern13(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch ='A'; ch < 'A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(int)('A'+i)+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for(int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakPoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for(int i = 0; i < n; i++) {
            for(char ch = (char)(int)('A'+n-1-i); ch <= (char)(int)('A'+n-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        int space = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }

        space = 2 * n -2;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            space -= 2;
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        int spaces = 2*n - 2;
        for(int i = 1; i <= 2*n-1; i++) {
            int star = i;
            if(i > n) star = 2*n - i;
            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces -= 2;
            else spaces += 2;
        }
    }

    public static void pattern21(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        for (int i = 0; i < 2*n - 1; i++) {
            for (int j = 0; j < 2*n -1; j++) {
                int top = i;
                int left = j;
                int right = (2*n - 2) - j;
                int botton = (2*n - 2) - i;

                System.out.print(n - Math.min(Math.min(top, botton), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}
