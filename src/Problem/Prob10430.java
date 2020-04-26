package Problem;

import java.util.Scanner;

public class Prob10430 {
    public static void main(String[] args) {
        // (A + B) % C는 ((A % C) + (B % C)) % C 와 같을까?
        // (A * B) % C는 ((A % C) * (B % C)) % C 와 같을까?
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
    }
}
