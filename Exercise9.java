import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        double centerX, centerY, r, posX, posY, deltaX, deltaY, squaredDist;
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        centerX = sc.nextDouble();
        centerY = sc.nextDouble();
        r = sc.nextDouble();

        System.out.print("점 입력>>");
        posX = sc.nextDouble();
        posY = sc.nextDouble();

        deltaX = centerX - posX;
        deltaY = centerY - posY;

        squaredDist = deltaX * deltaX + deltaY * deltaY;

        System.out.print("점 ("+posX+", "+posY+")는 ");
        if (squaredDist < r * r) {
            System.out.println("원 안에 있다.");
        } else {
            System.out.println("원 안에 있지 않다.");
        }

        sc.close();
    }
}
