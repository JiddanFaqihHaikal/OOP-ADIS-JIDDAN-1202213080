public class Perangkat {

    // There are 3 protected variable where drive is string, processor is float., and ram is int
    String drive;
    double processor;
    int ram;
    // There’s 1 Constructor Perangkat(String drive, float processor, int ram)
    // (this) refers to the current object in a method or constructor
    public Perangkat(String drive, double processor, int ram){
        this.drive = drive;
        this.processor = processor; 
        this.ram = ram;
    }
    public Perangkat(String drive2, int ram2, double processor2, boolean webcam) {
    }
    // There’s 1 public Method which is informasi()
    // which will print out the following
    public void informasi(){
        System.out.println("Device not known to have drive type "+drive+" with a ram of "+ram+" GB and fast processor of "+processor+" Ghz");
    }
}
