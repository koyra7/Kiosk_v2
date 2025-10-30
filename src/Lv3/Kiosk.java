package Lv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //생성자
    public Kiosk() {
        this.initItems();
    }

    public Kiosk(String name, double price, String info) {
        this.menuItems.add(new MenuItem(name, price, info));
    }

    // 데이터
    public void initItems() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }


    // 게터 생성
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void Start() {

        boolean swc = true;
        while (swc) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < 4; i++) {
                int j = i + 1;
                System.out.println(j + ". " + menuItems.get(i).name + " | " + menuItems.get(i).price + " | " + menuItems.get(i).info);
            }
            System.out.println("0. 종료 ");


            // 입력
            // 문자열 한줄로 입력받고, int로 변환
            String str = sc.nextLine().trim();
            int object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + getMenuItems().get(0).name + " | W " + getMenuItems().get(0).price + " | " + getMenuItems().get(0).info);
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + getMenuItems().get(1).name + " | W " + getMenuItems().get(1).price + " | " + getMenuItems().get(1).info);
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + getMenuItems().get(2).name + " | W " + getMenuItems().get(2).price + " | " + getMenuItems().get(2).info);
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + getMenuItems().get(3).name + " | W " + getMenuItems().get(3).price + " | " + getMenuItems().get(3).info);
                            swc = false;
                            break;
                        case 0:
                            System.out.println(" 프로그램을 종료합니다. ");
                            swc = false;
                            break;
                    }
                } else { // 0~4 벗어날경우
                    System.out.println(" 0~4 사이의 숫자를 입력해주세요. ");
                }
            } catch (NumberFormatException e) { // 문자를 입력할 경우
                System.out.println(" 숫자를 입력해주세요. ");
            }
        }

    }
}