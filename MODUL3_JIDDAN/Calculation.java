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
  
    public void setCircle(double radius) {
      this.radius = radius;
      this.area = phi * radius * radius;
    }
  
    public double getCircle() {
      return this.area;
    }
  
    public void setTrapezoid(double a, double b, double t) {
      this.area = (a + b) * t / 2;
    }
  
    public double getTrapezoid() {
      return this.area;
    }
  