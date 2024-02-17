package lab2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double x = scanner.nextDouble();

        for (int i = 0; i < n; i++){
            sum += Math.pow(x, (4*n+1))/4*n + 1;
        }
        System.out.println(sum);

    }
}
