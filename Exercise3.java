import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int money, oman, man, cheon, baek, osip, sip, yil;
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();

        oman = money / 50000;
        money %= 50000;

        man = money / 10000;
        money %= 10000;

        cheon = money / 1000;
        money %= 1000;

        baek = money / 100;
        money %= 100;

        osip = money / 50;
        money %= 50;

        sip = money / 10;
        money %= 10;

        yil = money;

        System.out.println("오만원권 "+oman+"매");
        System.out.println("만원권 "+man+"매");
        System.out.println("천원권 "+cheon+"매");
        System.out.println("백원 "+baek+"매");
        System.out.println("오십원 "+osip+"매");
        System.out.println("십원 "+sip+"매");
        System.out.println("일원 "+yil+"매");
    }
}
