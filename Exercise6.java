import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int num, a, b;

        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        num = sc.nextInt();
        a = num % 10;
        b = num / 10;

        boolean judgeA = a != 0 && a % 3 == 0;
        boolean judgeB = b != 0 && b % 3 == 0;

        if (judgeA && judgeB) {
            System.out.println("박수짝짝");
        } else if (judgeA || judgeB) {
            System.out.println("박수짝");
        }

        sc.close();
    }
}
