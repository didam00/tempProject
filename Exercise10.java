import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        int posX1, posY1, r1, posX2, posY2, r2, deltaX, deltaY, sumRadius;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        posX1 = sc.nextInt();
        posY1 = sc.nextInt();
        r1 = sc.nextInt();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        posX2 = sc.nextInt();
        posY2 = sc.nextInt();
        r2 = sc.nextInt();

        deltaX = posX2 - posX1;
        deltaY = posY2 - posY1;
        sumRadius = r1 + r2;

        if ((deltaX * deltaX + deltaY * deltaY) < sumRadius * sumRadius) {
            System.out.println("두 원은 서로 겹친다.");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

        sc.close();
    }
}
