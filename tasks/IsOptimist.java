package tasks;

import java.util.Scanner;

public class IsOptimist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double glass = 0.5;

        boolean isOptimist = sc.nextBoolean();
//        if (isOptimist) {
//            System.out.println((int) Math.ceil(glass));
//        } else System.out.println((int) Math.floor(glass));

        System.out.println(isOptimist ? (int) Math.ceil(glass) : (int) Math.floor(glass));
    }
}
