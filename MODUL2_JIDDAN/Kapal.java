public class Kapal extends TransportasiAir {
    //This is the variable
    protected String mesin;
    
    //This is the constructor for Kapal
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    
    //This is the Method for Informasi
    public void informasi(){
        System.out.println("");
    }
    //This is the method for Berlayar
    public void berlayar(){
        System.out.println("");
    }
    //This is the method for kecepetan
    public void berlayar(int kecepetan){
        System.out.println("");
    }
    //This is the method for berlabuh
    public void berlabuh(){
        System.out.println("");
    }
}
