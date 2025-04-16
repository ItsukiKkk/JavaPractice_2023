import java.util.Scanner;
public class cash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入购买金额：");
        double buy = scanner.nextDouble();
        System.out.print("请输入支付金额：");
        double pay = scanner.nextDouble();
        scanner.close();
        double cash = pay - buy;
        System.out.println("找回零钱：" + cash);
    }
}

