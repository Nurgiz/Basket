public class Main {
    public static void main(String[] args) {
       Basket vasyaBasket = new Basket();
       vasyaBasket.add("Молоко", 75);
       vasyaBasket.add("Хлеб", 37);

       Basket petyaBasket = new Basket();
       petyaBasket.add("Лопата", 280);
       petyaBasket.add("Бочка", 2900);

       vasyaBasket.print("Карзина Васи: ");
       petyaBasket.print("Карзина Пети:");
    }
}
