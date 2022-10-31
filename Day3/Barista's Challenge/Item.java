public class Item{
    //member variables
    private String name;
    private double price;

    //setter
    public void setName (String n){
        this.name = n;
    }

    public void setPrice (double P){
        this.price = P;
    }

    //getter
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}