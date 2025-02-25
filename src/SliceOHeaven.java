public class SliceOHeaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    // 定义一个 final 变量，用于存储默认的订单 ID
    public final String DEF_ORDER_ID = "DEF-SOH-099";
    // 定义一个 final 变量，用于存储默认的披萨配料
    public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    // 定义一个 final 变量，用于存储默认的订单总价
    public final double DEF_ORDER_TOTAL = 15.00;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    // 将 orderID 和 orderTotal 设为私有变量
    private String orderID;
    private double orderTotal;

    // 默认构造函数，设置默认值
    public SliceOHeaven() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "None";
        this.drinks = "None";
    }

    // 另一个构造函数，接受订单 ID、披萨配料和订单总价作为参数
    public SliceOHeaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    // 接受订单的方法
    public void takeOrder() {
        // 这里不更新订单 ID 和总价，使用默认值
        System.out.println("Order accepted!");
        makePizza();
        System.out.println("Your order is ready!");
        printReceipt();
    }

    // 制作披萨的方法
    private void makePizza() {
        System.out.println("Pizza is being prepared with the following ingredients: " + pizzaIngredients);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Pizza preparation interrupted!");
        }
        System.out.println("Pizza is ready!");
    }

    // 打印收据的方法，设为私有
    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Order ID: " + getOrderID());
        System.out.println("Order Total: " + getOrderTotal());
    }

    // orderID 的 Getter 方法
    public String getOrderID() {
        return orderID;
    }

    // orderID 的 Setter 方法
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    // orderTotal 的 Getter 方法
    public double getOrderTotal() {
        return orderTotal;
    }

    // orderTotal 的 Setter 方法
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public static void main(String[] args) {
        SliceOHeaven pizzeria = new SliceOHeaven();
        pizzeria.storeName = "Slice-o-Heaven";
        pizzeria.storeAddress = "123 Pizza Street";
        pizzeria.storeEmail = "contact@sliceoheaven.com";
        pizzeria.storePhone = 1234567890L;
        pizzeria.storeMenu = "Pizza, Sides, Drinks";
        pizzeria.pizzaPrice = 12.99;

        // 调用修改后的 takeOrder 方法
        pizzeria.takeOrder();
    }
}