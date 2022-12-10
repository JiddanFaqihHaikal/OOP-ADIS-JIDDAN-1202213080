public class Sampan extends TransportasiAir {
    //This is the variable
    protected int layar;
    
    //This is the constructor for Sampan
    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    //This is the overriding method for informasi
    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi + "ditetapkan dengan biaya sebesar " + biaya);
    }

    //This is the overriding method for berlayar
    @Override
    public void berlayar() {
        System.out.println("Transportasi Air dengan jenis Sampan sedang berlayar menggunakan" + layar + "layar");
    }

    //This is the overriding method for berlabuh
    @Override
    public void berlabuh() {
        System.out.println("Transportasi Air berlabuh di pantai tanpa jangkar");
        System.out.println("Transportasi Air berlabuh di pantai menggunakan " + berlabuh(jangkar) + "jangak");
    }

    //This is the method for Informasi
    public void informasi(){
        System.out.println("");
    }
    //This is the method for Berlayar
    public void berlayar(){
        System.out.println("");
    }
    //This is the method for Berlabuh
    public void berlabuh(){
        System.out.print("");
    }
    //This is the method for Berlabuh(int jangkar)
    public void berlabuh(int jangkar){
        System.out.println("");
    }
}
