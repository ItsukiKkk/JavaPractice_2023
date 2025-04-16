public class ex1 {
    public static void main(String[] args) {
        int x, y, j;
        for (x = 0; x <= 100; x++) {
            for (y = 0; y <= 100; y++) {
                j = 100 - x - y; 
                int mon = 5 * y + 3 * x + j / 3; 
                int sum = x + y + j; 
                if (sum == 100 && mon == 100) {
                    System.out.println("Ä¸¼¦:" + x + " ¹«¼¦:" + y + " ¼¦³û" + j + " Ö»");
                }
            }
        }
    }
}
