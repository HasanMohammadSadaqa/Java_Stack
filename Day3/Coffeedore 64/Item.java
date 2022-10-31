public class Item {

    // member variables
    private String name;
    private double price;
    private int index;

    // setter
    public void setName(String n) {
        this.name = n;
    }

    public void setPrice(double P) {
        this.price = P;
    }

    public void setIndes(Integer index) {
        this.index = index;
    }
    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}