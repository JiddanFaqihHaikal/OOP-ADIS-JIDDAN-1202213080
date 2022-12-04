public class Handphone extends Perangkat{

    // There’s 1 protected variable which is fingerprint(boolean)
    protected boolean fingerprint;
    // There’s 1 Constructor Handphone
    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        super(drive, processor, ram);
    }
    //There are 4 public Method which are informasi(), kirimSMS(int no_hp1, int no_hp2), kirimSMS(no_hp), and telfon(int no_hp)
    // First public Method --> Create public method called informasi
    public void informasi(){
        if(fingerprint){
            System.out.println("This mobile has a type drive "+drive+" with a ram of "+ram+" GB and a processor of "+processor+" Ghz. In addition, this cellphone has a fingerprint");
        } else {
            System.out.println("This mobile has a type drive "+drive+" with a ram of "+ram+" GB and a processor of "+processor+" Ghz. In addition, this cellphone does not have a fingerprint");
        }
    }
    // Second public Method --> kirimSMS(int no_hp1)
    public void kirimSMS(int no_hp){
        System.out.println("Mobile successfully sent SMS to "+no_hp);
    }
    // Third public Method --> kirimSMS(int no_hp2)
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Mobile successfully sent SMS to "+no_hp1+" and to No "+no_hp2);
    }
    // Fourth public Method --> telfon(int no_hp)
    public void telfon(int no_hp){
        System.out.println("Mobile successfully connected to the phone "+no_hp);
    }
}
