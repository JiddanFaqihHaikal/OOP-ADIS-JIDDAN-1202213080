import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant food = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.println("Input the ID: ");
            customerID = input.nextInt();

            System.out.println("How much food that has to be made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(food);
            Waiter waiter = new Waiter(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input was not an integer");
        }

    }

}
