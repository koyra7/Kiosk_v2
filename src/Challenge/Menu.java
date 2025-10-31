package Challenge;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> MenuList = new ArrayList<>();


    // 첫번째 카테고리
    public Menu() {
        this.firstMenu();

    }

    // 메뉴 카테고리 데이터
     public void firstMenu() {
        MenuList.add("Burgers");
        MenuList.add("Drinks");
        MenuList.add("Desserts");
        MenuList.add("Orders");
        MenuList.add("Cancel");
    }

    public ArrayList<String> getMenuList() {
        return MenuList;
    }
}
