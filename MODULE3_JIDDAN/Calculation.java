public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;
  
    public void setSquare(double side) {
      this.side = side;
      this.area = side * side;
    }
  
    public double getSquare() {
      return this.area;
    }
  

  