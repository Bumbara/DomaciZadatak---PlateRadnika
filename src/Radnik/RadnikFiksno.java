package Radnik;

public class RadnikFiksno extends Radnik{

@Override
    public void isplatiPlatu() {
    System.out.println("Ime i prezime radnika: " + ime + " " + prezime);
    System.out.println("JMBG radnika: " + jmbg);
    System.out.println("Ziro racun radnika: " + ziroRacun);
    System.out.println("Mesecna plata zaposlenog je: " + plata + " dinara");
}

}
