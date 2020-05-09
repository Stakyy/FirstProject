package Items;

public class Item {
    private  String type;
    private final int code;
    private final String name;
    private final double price;



    public Item(String type, int code,String name, double price) {
        this.type = type;
        this.code = code;
        this.name = name;
        this.price = price;

    }

    public Item(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Код товара: " + code +  " Название: " + " " + name  + " Цена: " + price;
    }


}
