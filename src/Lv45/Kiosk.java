package Lv45;

import java.util.Scanner;

public class Kiosk {

    // 속성
    Scanner sc = new Scanner(System.in);
    Data data = new Data();
    Menu menu = new Menu();

    // 카테고리
    public void Category() {


        System.out.println("\n[ MAIN MENU ]");

        for(int i = 0; i < 3; i++) {
             int j = i+1;
            System.out.println(j + ". " + menu.getMenuList().get(i));

        }
        System.out.println("0. 종료 ");

        try {
            boolean flag = true;

            while (flag) {

                // 입력 받기
                String str = sc.nextLine();
                int object = Integer.parseInt(str);

                if( object >=0 && object < 4) {}
                switch (object) {
                    case 1:
                        Start();
                        flag = false;
                        break;
                    case 2:
                        Drink();
                        flag = false;
                        break;
                    case 3:
                        Dessert();
                        flag = false;
                        break;
                    case 0:
                        System.out.println("프로그램을 종료합니다.");
                        flag = false;
                        break;
                    default:
                        System.out.println(" 0~3 이내의 숫자를 입력해주세요. ");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
            Category();
        }
    }



// 햄버거
    public void Start() {

        boolean swc = true;
        while (swc) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < 4; i++) {
                int j = i + 1;
                System.out.println(j + ". " + data.getItems().get(i).getName() + " | " + data.getItems().get(i).getPrice() + " | " + data.getItems().get(i).getInfo());
            }
            System.out.println("0. 뒤로가기 ");

            // 입력
            // 문자열 한줄로 입력받고, int로 변환
            String str = sc.nextLine().trim();
            int object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(0).getName() + " | W " + data.getItems().get(0).getPrice() + " | " + data.getItems().get(0).getInfo());
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(1).getName() + " | W " + data.getItems().get(1).getPrice() + " | " + data.getItems().get(1).getInfo());
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(2).getName() + " | W " + data.getItems().get(2).getPrice() + " | " + data.getItems().get(2).getInfo());
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(3).getName() + " | W " + data.getItems().get(3).getPrice() + " | " + data.getItems().get(3).getInfo());
                            swc = false;
                            break;
                        case 0:
                            System.out.println(" 뒤로갑니다. ");
                            Category();
                            swc = false;
                            break;
                    }
                } else { // 0~4 벗어날경우
                    System.out.println(" 0~4 사이의 숫자를 입력해주세요. ");
                }
            } catch (NumberFormatException e) { // 문자를 입력할 경우
                System.out.println(" 숫자를 입력해주세요. ");
                Start();
            }
        }

    }

    // 음료수
    public void Drink() {

        boolean swc = true;
        while (swc) {
            System.out.println("[ Drink MENU ]");
            for (int i = 0; i < 4; i++) {
                int j = i + 1;
                System.out.println(j + ". " + data.getDrinkItems().get(i).getName() + " | " + data.getDrinkItems().get(i).getPrice() + " | " + data.getDrinkItems().get(i).getInfo());
            }
            System.out.println("0. 뒤로가기 ");

            // 입력
            // 문자열 한줄로 입력받고, int로 변환
            String str = sc.nextLine().trim();
            int object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(0).getName() + " | W " + data.getDrinkItems().get(0).getPrice() + " | " + data.getDrinkItems().get(0).getInfo());
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(1).getName() + " | W " + data.getDrinkItems().get(1).getPrice() + " | " + data.getDrinkItems().get(1).getInfo());
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(2).getName() + " | W " + data.getDrinkItems().get(2).getPrice() + " | " + data.getDrinkItems().get(2).getInfo());
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(3).getName() + " | W " + data.getDrinkItems().get(3).getPrice() + " | " + data.getDrinkItems().get(3).getInfo());
                            swc = false;
                            break;
                        case 0:
                            System.out.println(" 뒤로갑니다. ");
                            Category();
                            swc = false;
                            break;
                    }
                } else { // 0~4 벗어날경우
                    System.out.println(" 0~4 사이의 숫자를 입력해주세요. ");
                }
            } catch (NumberFormatException e) { // 문자를 입력할 경우
                System.out.println(" 숫자를 입력해주세요. ");
                Drink();
            }
        }

    }

    public void Dessert() {

        boolean swc = true;
        while (swc) {
            System.out.println("[ Dessert MENU ]");
            for (int i = 0; i < 4; i++) {
                int j = i + 1;
                System.out.println(j + ". " + data.getDessertItems().get(i).getName() + " | " + data.getDessertItems().get(i).getPrice() + " | " + data.getDessertItems().get(i).getInfo());
            }
            System.out.println("0. 뒤로가기 ");

            // 입력
            // 문자열 한줄로 입력받고, int로 변환
            String str = sc.nextLine().trim();
            int object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(0).getName() + " | W " + data.getDessertItems().get(0).getPrice() + " | " + data.getDessertItems().get(0).getInfo());
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(1).getName() + " | W " + data.getDessertItems().get(1).getPrice() + " | " + data.getDessertItems().get(1).getInfo());
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(2).getName() + " | W " + data.getDessertItems().get(2).getPrice() + " | " + data.getDessertItems().get(2).getInfo());
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(3).getName() + " | W " + data.getDessertItems().get(3).getPrice() + " | " + data.getDessertItems().get(3).getInfo());
                            swc = false;
                            break;
                        case 0:
                            System.out.println(" 뒤로갑니다. ");
                            Category();
                            swc = false;
                            break;
                    }
                } else { // 0~4 벗어날경우
                    System.out.println(" 0~4 사이의 숫자를 입력해주세요. ");
                }
            } catch (NumberFormatException e) { // 문자를 입력할 경우
                System.out.println(" 숫자를 입력해주세요. ");
                Dessert();
            }
        }

    }

}