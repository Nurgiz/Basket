public class Basket {

    public  String items = "";
    public  int totalPrice = 0;


    public  void add(String name, int price) {
        if (contains(name)){
            return;
        }
        items = items + "\n" + name + "-" + price;
        totalPrice = totalPrice + price;
    }

    public  void clear() {
        items = "";
        totalPrice = 0;
    }

    public  int getTotalPrice() {
        return totalPrice;
    }

    public  void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Карзина пуста");
        }
        else {
            System.out.println(items);
        }
    }
    public  boolean contains(String name){
        return items.contains(name);
    }
}
