public class Store {
  //assign variables to data types 
    String productType;
    int inventoryCount;
    double inventoryPrice;
    boolean isExpensive;

    // new method: constructor!
    public Store(String product, int count, double price, boolean expensive) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
        isExpensive = expensive;

      System.out.println("Constructor method invoked");

  
    }
    
    // main method is where we create instances!
    public static void main(String[] args) {
      System.out.println("main method invoked");
      // create the instance below
      Store lemonadeStand = new Store("lemonade", 50, 4.68, false);
      Store cookieStand = new Store("cookies", 40, 5.00, true);
      Store orangeStand = new Store("oranges", 30, 2.19, false);
      Store appleStand = new Store("apples", 45, 22.90, true);
      boolean isOrangeMoreExpensive = orangeStand.inventoryPrice > cookieStand.inventoryPrice;
      boolean isAppleMoreExpensive = appleStand.inventoryPrice >lemonadeStand.inventoryPrice;

      double totalprice = cookieStand.inventoryPrice + lemonadeStand.inventoryPrice;
      
      // print the instance below whilst accessing the value within the instance field
      System.out.println(lemonadeStand.productType);
      System.out.println("these cookies will cost: " + cookieStand.inventoryPrice);
      System.out.println("we have: " + orangeStand.inventoryCount + "for sale");
      System.out.println("the cookies are cheaper than the oranges" + " ... " + isOrangeMoreExpensive);
      System.out.println ("the total price of the lemonades and the cookies will equal up to:" + totalprice);
      System.out.println("the apples are the most expensive items here" + "..." + isAppleMoreExpensive);
      System.out.println("main method finished");

    }
  }