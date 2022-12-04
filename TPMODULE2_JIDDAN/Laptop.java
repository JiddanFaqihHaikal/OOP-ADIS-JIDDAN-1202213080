public class Laptop extends Perangkat {

    // There’s 1 protected variable which is webcam(boolean)
    protected boolean webcam;
    // There’s 1 Constructor Laptop(String drive, int ram, float processor, boolean webcam)
    public Laptop(String drive, int ram, double processor, boolean webcam){
        super(drive, ram, processor, webcam);
    }
    @Override
    // There are 4 public Method which are informasi(), kirimEmail(String email), dan kirimEmail(String email1, String email2), and bukaGame(String nama_game)
    //This is the public Method for informasi()
    public void informasi(){
        if(webcam){
            System.out.println("This laptop has a type drive "+drive+" with a ram of "+ram+" GB and a processor of "+processor+" Ghz. In addition, this laptop has a webcam");
        } else {
            System.out.println("This laptop has a type drive "+drive+" with a ram of "+ram+" GB and a processor of "+processor+" Ghz. In addition, this laptop does not have a webcam");
        }
    }
    // This is the public Method for kirimEmail(String email)
    public void kirimEmail(String email){
        System.out.println("Laptop successfully sent Email to "+email);
    }
    // This is the public Method for kirimEmail(String email1, String email2)
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop successfully sent Email to "+email1+" and to "+email2);
    }
    // This is the public Method for bukaGame(String nama_game)
    public void bukaGame(String nama_game){
        System.out.println("The laptop successfully opened the game "+nama_game);
    }
}
