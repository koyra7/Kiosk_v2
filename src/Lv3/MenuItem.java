package Lv3;

public class MenuItem {

    // 속 | 캡슐화
    public String name;
    public double price;
    public String info;

    // 생
    MenuItem(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

}
