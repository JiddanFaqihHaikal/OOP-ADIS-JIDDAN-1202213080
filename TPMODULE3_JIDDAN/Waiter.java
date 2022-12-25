public class Waiter implements Runnable{
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("|||||||||||||||||||||||||||||||");
        System.out.println("ID of the person: " + this.customerID);
        System.out.println("Food Amount: " + this.orderQty);
        System.out.println("Total: " + this.orderQty * foodPrice);
        System.out.println("|||||||||||||||||||||||||||||||");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: The food is ready!");
            Restaurant food = new Restaurant();
            food.setWaitingForPickup(false);
            if (Restaurant.getCoffeeNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell to prepare another food\n");

        }
    }
}
