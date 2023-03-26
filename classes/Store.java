public class Store {
    String productType;
    int inventoryCount;
    double inventoryPrice;

    public Store(String product; int count; double price) {
        System.out.println("I am inside the constructor method");
        
        this.productType = product;
        this.inventoryCount = count;
        this.inventoryPrice = price;
    };
 
 
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 10,5);
        System.out.println("Product Name: " + lemonadeStand.productType);
        System.out.println("Count: " + lemonadeStand.inventoryCount);
        System.out.println("Price: " + lemonadeStand.inventoryPrice);


        Store cookieShop = new Store("cookie", 12, 3.75);

        System.out.println("Product Name: " + cookieShop.productType);
        System.out.println("Product Name: " + cookieShop.productType);
        System.out.println("Product Name: " + cookieShop.productType);
        
    }
}