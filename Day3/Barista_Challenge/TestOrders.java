public class TestOrders {
    public static void main(String[] args){
        //creating orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Hasan");
        Order order4 = new Order("Osama");
        Order order5 = new Order("Saeed");

        //creating Items
        Item item1 = new Item("Coffee", 5);
        Item item2 = new Item("drip coffee", 3.5);
        Item item3 = new Item("Latte", 12.5);
        Item item4 = new Item("Capuccino", 6.5);

        //adding items to orders using addItem method
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item3);
        order3.addItem(item4);
        order4.addItem(item4);
        order4.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item2);

        //testing the result and the display method
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        //test getStatusMessage Method
        order1.setReady(true);
        order1.getStatusMessage();
    }
}