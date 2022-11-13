package Radnik;

public class RadnikPoSatu extends Radnik{
    @Override
    public void isplatiPlatu() {
        System.out.println("Ime i prezime radnika: " + ime + " " + prezime);
        System.out.println("JMBG radnika: " + jmbg);
        System.out.println("Ziro racun radnika: " + ziroRacun);
        System.out.println("Satnica zaposlenog je: " + ((plata/22)/8) + " dinara");
    }
}
