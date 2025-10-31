package Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    // 속성
    Scanner sc = new Scanner(System.in);
    Data data = new Data();
    Menu menu = new Menu();
    String sign;
    int object;
    ArrayList<MenuItem> cart = new ArrayList<>();


    // 카테고리
    public void Category() {


        System.out.println("\n[ MAIN MENU ]");

        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println(j + ". " + menu.getMenuList().get(i));

        }
        System.out.println("0. 종료 ");

        if (cart != null && !cart.isEmpty()) {
            System.out.println("[ Orders ]");
            for (int i = 3; i < menu.getMenuList().size(); i++) {
                System.out.println((i + 1) + ". " + menu.getMenuList().get(i));
            }
        }

        try {
            boolean flag = true;

            while (flag) {

                // 입력 받기
                String str = sc.nextLine();
                object = Integer.parseInt(str);

                if (object >= 0 && object < 6) {
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
                        case 4:
                            buy();
                            flag = false;
                            break;
                        case 5:
                            System.out.println("장바구니를 초기화합니다.");
                            cart.clear();
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
            object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(0).getName() + " | W " + data.getItems().get(0).getPrice() + " | " + data.getItems().get(0).getInfo());
                            sign = "A";
                            Cart();
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(1).getName() + " | W " + data.getItems().get(1).getPrice() + " | " + data.getItems().get(1).getInfo());
                            sign = "A";
                            Cart();
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(2).getName() + " | W " + data.getItems().get(2).getPrice() + " | " + data.getItems().get(2).getInfo());
                            sign = "A";
                            Cart();
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getItems().get(3).getName() + " | W " + data.getItems().get(3).getPrice() + " | " + data.getItems().get(3).getInfo());
                            sign = "A";
                            Cart();
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
            object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(0).getName() + " | W " + data.getDrinkItems().get(0).getPrice() + " | " + data.getDrinkItems().get(0).getInfo());
                            sign = "B";
                            Cart();
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(1).getName() + " | W " + data.getDrinkItems().get(1).getPrice() + " | " + data.getDrinkItems().get(1).getInfo());
                            sign = "B";
                            Cart();
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(2).getName() + " | W " + data.getDrinkItems().get(2).getPrice() + " | " + data.getDrinkItems().get(2).getInfo());
                            sign = "B";
                            Cart();
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getDrinkItems().get(3).getName() + " | W " + data.getDrinkItems().get(3).getPrice() + " | " + data.getDrinkItems().get(3).getInfo());
                            sign = "B";
                            Cart();
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
            object = Integer.parseInt(str);

            // try-catch로 예외값 잡음
            try {
                if (0 <= object && object <= 4) {
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(0).getName() + " | W " + data.getDessertItems().get(0).getPrice() + " | " + data.getDessertItems().get(0).getInfo());
                            sign = "C";
                            Cart();
                            swc = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(1).getName() + " | W " + data.getDessertItems().get(1).getPrice() + " | " + data.getDessertItems().get(1).getInfo());
                            sign = "C";
                            Cart();
                            swc = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(2).getName() + " | W " + data.getDessertItems().get(2).getPrice() + " | " + data.getDessertItems().get(2).getInfo());
                            sign = "C";
                            Cart();
                            swc = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴 : " + data.getDessertItems().get(3).getName() + " | W " + data.getDessertItems().get(3).getPrice() + " | " + data.getDessertItems().get(3).getInfo());
                            sign = "C";
                            Cart();
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

    public void Cart () {
        if (sign.equals("A")) {
            sign = "D";
            System.out.println(data.getItems().get(object - 1).getName() + " | W " + data.getItems().get(object - 1).getPrice() + " | " + data.getItems().get(object - 1).getInfo());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인    2. 취소");

            String str = sc.nextLine().trim();
            int object2 = Integer.parseInt(str);

            if (object2 == 1) {
                cart.add(new MenuItem(data.getItems().get(object - 1).getName(), data.getItems().get(object - 1).getPrice(), data.getItems().get(object - 1).getInfo()));
                Category();
            } else {
                Category();
            }
        }

        if (sign.equals("B")) {
            sign = "D";
            System.out.println(data.getDrinkItems().get(object - 1).getName() + " | W " + data.getDrinkItems().get(object - 1).getPrice() + " | " + data.getDrinkItems().get(object - 1).getInfo());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인    2. 취소");

            String str = sc.nextLine().trim();
            int object2 = Integer.parseInt(str);

            if (object2 == 1) {
                cart.add(new MenuItem(data.getDrinkItems().get(object - 1).getName(), data.getDrinkItems().get(object - 1).getPrice(), data.getDrinkItems().get(object - 1).getInfo()));
                Category();
            } else {
                Category();
            }
        }

        if (sign.equals("C")) { //
            sign = "D";
            System.out.println(data.getDessertItems().get(object - 1).getName() + " | W " + data.getDessertItems().get(object - 1).getPrice() + " | " + data.getDessertItems().get(object - 1).getInfo());
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인    2. 취소");

            String str = sc.nextLine().trim();
            int object2 = Integer.parseInt(str);

            if (object2 == 1) {
                cart.add(new MenuItem(data.getDessertItems().get(object - 1).getName(), data.getDessertItems().get(object - 1).getPrice(), data.getDessertItems().get(object - 1).getInfo()));
                Category();
            } else {
                Category();
            }
        }
    }

    public void buy() {

        double sum = 0;

        System.out.println("[ Orders ]");
        for (int i = 0; i < cart.size(); i++) {
            System.out.println( cart.get(i).getName() + " | W " + cart.get(i).getPrice() + " | " + cart.get(i).getInfo() );
        }

        System.out.println("[ Total ]");
        for (int i = 0; i < cart.size(); i++) {
           sum += cart.get(i).getPrice();
        }
        System.out.println( "W " + sum );

        System.out.println("\n1.주문    2. 메뉴판");

        String str = sc.nextLine().trim();
        int object = Integer.parseInt(str);

        if(object==1){
            System.out.println("주문이 완료되었습니다. 금액은 W "+ sum +" 입니다.");

        } else if(object==2){
            Category();
        }



    }
}