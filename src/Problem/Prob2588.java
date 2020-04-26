package Problem;

import java.util.Scanner;

public class Prob2588 {
    public static int[] divided(int a) {
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++) {
            intArray[i] = (a / (int) Math.pow(10, 2 - i));
            a = a % (int) Math.pow(10, 2 - i);
        }
        return intArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] intB = divided(b);
        int result = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(a * intB[2 - i]);
            result += a * intB[2 - i] * Math.pow(10, i);
        }
        System.out.println(result);
    }
}
