public class SliceOHeaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;

    public SliceOHeaven() {
    }

    public void takeOrder(String id, double total) {
        this.orderID = id;
        this.orderTotal = total;
        System.out.println("Order accepted!");
        this.makePizza();
        System.out.println("Your order is ready!");
        this.printReceipt();
    }

    private void makePizza() {
        System.out.println("Pizza is being prepared with the following ingredients: " + this.pizzaIngredients);
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException var2) {
            System.out.println("Pizza preparation interrupted!");
        }
        System.out.println("Pizza is ready!");
    }

    private void printReceipt() {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + this.storeName);
        System.out.println("Store Address: " + this.storeAddress);
        System.out.println("Store Email: " + this.storeEmail);
        System.out.println("Store Phone: " + this.storePhone);
        System.out.println("Order ID: " + this.orderID);
        System.out.println("Order Total: " + this.orderTotal);
    }

    public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
        int cardLength = cardNumber.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

        String blacklistedNumber = "12345678901234";
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
        }

        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardLength - 4));

        StringBuilder cardNumberToDisplay = new StringBuilder();
        cardNumberToDisplay.append(cardNumber.charAt(0));
        for (int i = 1; i < cardLength - 4; i++) {
            cardNumberToDisplay.append('*');
        }
        cardNumberToDisplay.append(cardNumber.substring(cardLength - 4));

        System.out.println("First card digit: " + firstCardDigit);
        System.out.println("Last four digits: " + lastFourDigits);
        System.out.println("Card number to display: " + cardNumberToDisplay);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }

    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        StringBuilder specialDetails = new StringBuilder();
        specialDetails.append("Pizza of the day: ").append(pizzaOfTheDay);
        specialDetails.append("\nSide of the day: ").append(sideOfTheDay);
        specialDetails.append("\nSpecial price: ").append(specialPrice);
        System.out.println(specialDetails.toString());
    }

    public static void main(String[] args) {
        SliceOHeaven pizzeria = new SliceOHeaven();
        pizzeria.storeName = "Slice - o - Heaven";
        pizzeria.storeAddress = "123 Pizza Street";
        pizzeria.storeEmail = "contact@sliceoheaven.com";
        pizzeria.storePhone = 1234567890L;
        pizzeria.storeMenu = "Pizza, Sides, Drinks";
        pizzeria.pizzaIngredients = "Cheese, Tomato Sauce, Pepperoni";
        pizzeria.pizzaPrice = 12.99;
        pizzeria.sides = "Garlic Bread, Salad";
        pizzeria.drinks = "Soda, Water";
        pizzeria.takeOrder("001", 15.99);

        pizzeria.processCardPayment("12345678901234", "12/25", 123);
        pizzeria.specialOfTheDay("Margherita Pizza", "Onion Rings", "$10.99");
    }
}