// persentage of 3 Subject: 

import java.util.Scanner;

public class _PS_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();
        float persent = (num1 + num2 + num3) / 30;
        System.out.println(persent);
    }
}
