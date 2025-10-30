package Lv1;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[ SHAKESHACK MENU ");
        System.out.println("1. ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        int object = sc.nextInt();

        switch (object) {
            case 1:
                System.out.println(" ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                break;
            case 2:
                System.out.println("2. SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                break;
            case 3:
                System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                break;
            case 4:
                System.out.println("4. Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                break;
            case 0:
                System.out.println(" 프로그램을 종료합니다. ");
                break;
        }
    }
}