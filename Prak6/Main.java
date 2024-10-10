public class Main {
    public static void main(String[] args) throws Exception {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 25);

        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);

        Jagoan pitung = new Jagoan("Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);
        Senjata toya = new Senjata("Toya", 24);

        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        pitung.info();
        jakaSembung.info();

        jakaSembung.menyerang(pitung);
        jakaSembung.menyerang(pitung);
        
        pitung.menyerang(jakaSembung);

        jakaSembung.menyerang(pitung);

        pitung.menyerang(jakaSembung);

        System.out.println(pitung.getNama() + ": " + pitung.getNilaiKesehatan());
        System.out.println(jakaSembung.getNama() + ": " + jakaSembung.getNilaiKesehatan());

        if (pitung.getStatus() && jakaSembung.getStatus() == false) {
            System.out.println(pitung.getNama() + " Adalah Pemenangnya!");
        } else if (pitung.getStatus() == false && jakaSembung.getStatus()) {
            System.out.println(jakaSembung.getNama() + " Adalah Pemenangnya!");
        } else {
            if (pitung.getNilaiKesehatan() > jakaSembung.getNilaiKesehatan()) {
                System.out.println(pitung.getNama() + " Adalah Pemenangnya!");
            } else if (pitung.getNilaiKesehatan() < jakaSembung.getNilaiKesehatan()) {
                System.out.println(jakaSembung.getNama() + " Adalah Pemenangnya!");
            } else {
                System.out.println("Kedua jagoan seri!");
            }
        }
    }
};