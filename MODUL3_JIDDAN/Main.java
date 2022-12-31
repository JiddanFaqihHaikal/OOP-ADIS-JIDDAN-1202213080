import Calculation;

public static void main(String[] args) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    boolean repeat = true;
    do {
      try {
        System.out.println("EAD Areas Calculator");
        System.out.println("1. Calculate area of a square");
        System.out.println("2. Calculate area of a circle");
        System.out.println("3. Calculate area of a trapezoid");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch(choice) {
          case 1:
            // calculate area of a square
            break;
          case 2:
            // calculate area of a circle
            break;
          case 3:
            // calculate area of a trapezoid
            break;
          case 0:
            System.out.println("Exiting program...");
            repeat = false;
            break;
          default:
            System.out.println("Option not available");
            continue;
        }