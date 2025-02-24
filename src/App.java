public class App {
    public static void main(String[] args) throws Exception {
        SliceOHeaven sliceOHeaven = new SliceOHeaven();
        sliceOHeaven.storeName = "Slice-o-Heaven";
        sliceOHeaven.storeAddress = "123 Pizza Street";
        sliceOHeaven.storeEmail = "contact@sliceoheaven.com";
        sliceOHeaven.storePhone = 1234567890L;
        sliceOHeaven.storeMenu = "Pizza, Sides, Drinks";
        sliceOHeaven.pizzaIngredients = "Cheese, Tomato Sauce, Pepperoni";
        sliceOHeaven.pizzaPrice = 12.99;
        sliceOHeaven.sides = "Garlic Bread, Salad";
        sliceOHeaven.drinks = "Soda, Water";

        sliceOHeaven.takeOrder("1234", 15.99);
    }
}