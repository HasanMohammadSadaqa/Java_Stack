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

}