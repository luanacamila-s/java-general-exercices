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

    public void advertise() {
        System.out.println("Come spend some money");
        System.out.println("Selling" + productType);
    }
    public void greetCostumer(String costumer) {
        System.out.println("Welcome to the store " + costumer + ":");
    }
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("The lemonade price is:" + price);
    }

    public double getPriceWithTax() {
        double totalprice = price + price * 0.08;
        return totalprice
    }
 
 
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 10,5);
        System.out.println("Product Name: " + lemonadeStand.productType);
        System.out.println("Count: " + lemonadeStand.inventoryCount);
        System.out.println("Price: " + lemonadeStand.inventoryPrice);
        
        lemonadeStand.advertise();
        lemonadeStand.greetCostumer();
        lemonadeStand.increasePrice(1.5);
        
        double lemonadePrice = lemonadeStand.getPriceWithTax(); 
        System.out.println("The lemonade price with tax is: " + lemonadePrice);
    }
}