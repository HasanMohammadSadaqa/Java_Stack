import java.util.ArrayList;

public class CoffeeKiosk{
    //member data 
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    //setter 
    public void setMenu(ArrayList<Item> menu){
        this.menu = menu;
    }

    public void setOrder(ArrayList<Order> order){
        this.orders = order;
    }

    //getter
    public ArrayList<Item> getMenu (){
        return menu;
    }

    public ArrayList<Order> getOrder (){
        return orders;
    }

    //Constructor 
    CoffeeKiosk (){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    //Methods
    //addMenuItem
    public void addMenuItem(String name, double price){
        Item newItem = new Item("Tea", 7.5);
        this.menu.add(newItem);
        newItem.setIndex(menu.size()-1);
    }

    //displayMenu
    public void displayMenu(){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i+ " " + menu.get(i).getName() + " --$" + menu.get(i).getPrice());
        }
    }

    //newOrder
    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order order = new Order(name);
        this.orders.add(order);
        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")) {
            Item item = this.menu.get(Integer.parseInt(itemNumber));
            order.addItem(item);
            System.out.println("Enter another menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        order.display();
    }
}