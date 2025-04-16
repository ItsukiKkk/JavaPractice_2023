public class ex3 {
    public static void main(String[] args) {
        int sum = 0;
        int nMax = 0; 
        for (int n = 1; n < 1000; n++) {
            int m = n * 10 + 2;
            sum = m + sum;
            if (sum <= 1000) {
                nMax = n; 
            } else {
                break; 
            }
        }
        System.out.println("满足条件的最大的 n 值为: " + nMax);
    }
}
