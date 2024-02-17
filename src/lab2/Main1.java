package lab2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, y ,x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        if (x <= 1){
            y = 1 / (Math.pow(a, 2) + Math.pow(b, 2));
        } else {
            y = b * Math.log10(Math.abs(x));
        }
        System.out.println(y);


    }
}
