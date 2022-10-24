public class CafeJava{
    public static void main(String[]args) {
        String generalGreeting = "welcome to Cafe Java,";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";
        double mochaPrice = 3.5;
        int Coffee = 7;
        int latte = 13;
        double cappuccino = 4.5;
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noha";
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        String newLine = System.lineSeparator();
        System.out.println(generalGreeting + customer1 + readyMessage + displayTotalMessage + Coffee);
        System.out.print(generalGreeting + customer4);
        if(isReadyOrder4){
            System.out.println(readyMessage + displayTotalMessage + cappuccino);
        }
        else{
            System.out.print(pendingMessage);
        }
        System.out.print(newLine + generalGreeting + customer2);
        System.out.print(displayTotalMessage + 2*latte + " and");
        if (isReadyOrder3){
            System.out.print(readyMessage);
        }
        else{
            System.out.print (newLine + pendingMessage);
        }
        System.out.println(newLine + "sorry " + customer3 + " you paid for coffee but your order was latte, so your total was " + latte + " not " + Coffee + " so the diffrence is " + (latte - Coffee) );
    }
}