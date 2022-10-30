import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for(int i =0; i<10; i++){
            sum = sum+i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customer){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customer.size() + " people in front of you");
        customer.add(userName);
    }
}
