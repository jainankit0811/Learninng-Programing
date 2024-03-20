public class _PS_6 {
    public static void main(String[] args) {
        char gread = 'B';
        gread = (char) (gread + 8);
        System.out.println(gread);

        // Decrypting the gread
        gread = (char) (gread - 8);
        System.out.println(gread);
    }
}
