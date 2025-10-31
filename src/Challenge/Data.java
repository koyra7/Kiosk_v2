package Challenge;

import java.util.ArrayList;

public class Data {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private ArrayList<MenuItem> DrinkItems = new ArrayList<>();
    private ArrayList<MenuItem> DessertItems = new ArrayList<>();

    public Data() {
        this.HamItems();
        this.DriItems();
        this.DessertItems();
    }

    public Data(String name, double price, String info) {
        this.menuItems.add(new MenuItem(name, price, info));
    }

    // 햄버거 데이터
    public void HamItems() {
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void DriItems() {
        DrinkItems.add(new MenuItem("Soda", 2.1, "시원한 소다맛 음료"));
        DrinkItems.add(new MenuItem("Remon" , 2.1, "상쾌한 레몬에이드"));
        DrinkItems.add(new MenuItem("Zero Cock", 1.5, "시원한 제로콜라"));
        DrinkItems.add(new MenuItem("Saidar" , 1.5 , "청량한 사이다"));
    }

    public void DessertItems() {
        DessertItems.add(new MenuItem("Cheese Cake", 3.0, "녹진한 치즈케이크"));
        DessertItems.add(new MenuItem("Poteto chip" , 1.5, "고소한 감자 칩"));
        DessertItems.add(new MenuItem("Onion ring", 1.0, "맛있는 양파링"));
        DessertItems.add(new MenuItem("Putin" , 2.0 , "맛있는 캐나다의 푸틴"));
    }

    // getter
    public ArrayList<MenuItem> getItems() {
        return menuItems;
    }

    public ArrayList<MenuItem> getDrinkItems() {
        return DrinkItems;
    }

    public ArrayList<MenuItem> getDessertItems() {
        return DessertItems;
    }


}
