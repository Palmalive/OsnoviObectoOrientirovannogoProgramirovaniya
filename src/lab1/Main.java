package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 9.2;
        double b = 3.5;
        double c = 12.3;
        double x = scanner.nextDouble();
        double y = Math.pow((a * Math.abs(4.19 * Math.pow(x, 3) - c) - (Math.abs(b * Math.log10(x) + c))), - 1);
        System.out.println(y);
    }
}