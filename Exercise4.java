import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("정수 3개 입력>>");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print("중간 값은 ");
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            System.out.println(b);
        } else if ((a <= c && c <= b) || (b <= c && c <= a)) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
