package kioskMyself;

public class Product extends Menu {
    static double price;

    // 상품메뉴 공통
    public String product(){
        return name + " | " + "W " + price + " | " + explain;
    }
    public String productInput(String a, double b, String c){
        this.name = a;
        this.price = b;
        this.explain = c;
        return product();
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

}
