import java.util.ArrayList;

public class Order{
    //member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //constructor 
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    //Overloaded Constructor: 
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //Mutators(Setters)
    public void setName(String n){
        this.name = n;
    }
    public void setReady(Boolean isReady){
        this.ready = isReady;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    //Accessors(Getters)
    public String getName(){
        return name;
    }
    public boolean isReady(){
        return ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }

    //Methods
    //addItem Method
    public void addItem(Item item){
        this.items.add(item);
    }
    //getStatusMessage Method
    public void getStatusMessage(){
        if (this.ready == true){
            System.out.println("Your order is ready!");
        }
        else{
            System.out.println("Thank you for waiting, your order will be ready soon!");
        }
    }
    //display method
    public void display() {
        System.out.printf("Customer Name: %s \n",this.name);
        for(int i = 0; i<items.size(); i++){
            System.out.println(items.get(i).getName() + " - " + items.get(i).getPrice());
        }
        System.out.println("Total: " + getOrderTotal());
    }
    //getOrderTotal Method
    public double getOrderTotal(){
        double sum = 0.0;
        for(int i = 0; i<items.size(); i++){
            sum+= items.get(i).getPrice();
        }
        return sum;
    }

}