package Java;

public class ForEach1 {
    public static void main(String[] args) {
        int[] prime = { 1, 3, 5, 7, 11, 13, 17, 19 };
        System.out.println("Prime numbers are :");
        for (int i : prime) {
            System.out.println(i);
        }
    }
}  