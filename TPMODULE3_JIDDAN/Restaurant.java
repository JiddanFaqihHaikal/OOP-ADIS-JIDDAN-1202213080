public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getCoffeeNumber() {
        return foodNumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiter has to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Restaurant:  Preparing number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Tell waiter to grab the coffee\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}