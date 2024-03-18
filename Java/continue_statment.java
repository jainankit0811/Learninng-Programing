package Java;

public class continue_statment {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 12) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
