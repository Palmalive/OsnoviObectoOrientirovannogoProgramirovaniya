package lab2;

import lab1.Main;

import java.util.Scanner;

public class Main2 {


    private int field;

    public Main2() {
    }

    public Main2(int field){
        this.field = field;
    }

    public Main2(Main2 main2) throws CloneNotSupportedException {
        main2 = (Main2) this.clone();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        double x = scanner.nextDouble();
        int index = 0;
        while (index < n){
            sum += Math.pow(x, (4*n+1))/4*n + 1;
            index++;
        }
/*        for (int i = 0; i < n; i++){
            sum += Math.pow(x, (4*n+1))/4*n + 1;
        }*/
        System.out.println(sum);

    }
}
