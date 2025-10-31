package Challenge;

public class MenuItem {

    // 속 | 캡슐화
    private String name;
    private double price;
    private String info;

    // 생
    MenuItem(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }


    //getter
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}
