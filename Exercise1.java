import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int won;
        double dollor;
        final int EXCHANGE_RATE = 1100;

        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        won = sc.nextInt();

        dollor = (double)won / EXCHANGE_RATE;
        System.out.println(won+"원은 $"+dollor+"입니다.");

        sc.close();
    }
}