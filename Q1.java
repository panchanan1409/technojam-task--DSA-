import java.util.Scanner;

public class Q1 {
    public static void generatePascalTriangle(int n) {
        //write your code here
        System.out.println("Number of lines: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int number = 1;

            for (int s = 1; s<n-i; s++) { //printing spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                number = number * (i-j) / (j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}
