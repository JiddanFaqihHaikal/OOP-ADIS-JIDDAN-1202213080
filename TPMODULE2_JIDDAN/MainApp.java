public class MainApp {
    public static void main(String[] args){
        // This is for Perangkat
        Perangkat pkt = new Perangkat(null, 0, 0);
        pkt.drive = "Adata";
        pkt.ram = 32;
        pkt.processor = 3.0;
        // This is for Laptop
        Laptop lp = new Laptop(null, 0, 0, true);
        lp.drive = "Adata";
        lp.ram = 16;
        lp.processor = 1.6;
        lp.webcam = false;
        // This is for Handphone
        Handphone hp = new Handphone(null, 0, 0, true);
        hp.drive = "Kingston";
        hp.ram = 2;
        hp.processor = 1.2;
        hp.fingerprint = true;
        // This will show the information for Perangkat
        pkt.informasi();
        // This will jump a line to make it organized
        System.out.println();
        // This will show the information  for Laptop
        lp.informasi();
        lp.bukaGame("Guitar Hero");
        lp.kirimEmail("jiddanhaikal2@gmail.com");
        lp.kirimEmail("jiddanhaikal@student.telkomuniversity.ac.id","GuitarHeroMaster@gmail.com");
        // This will jump a line to make it organized
        System.out.println();
        // This will show the Information for Handphone
        hp.informasi();
        hp.telfon(621234567);
        hp.kirimSMS(621234567);
        hp.kirimSMS(621234567, 621234444);
    }
}
