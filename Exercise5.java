import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("정수 3개를 입력하시오>>");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("삼각형이 됩니다");
        } else {
            System.out.println("삼각형이 되지 않습니다");
        }

        sc.close();
    }
}
