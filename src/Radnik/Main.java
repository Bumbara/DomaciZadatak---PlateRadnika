package Radnik;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Radnik fiksnaPlata = new RadnikFiksno();
        Radnik dnevnaPlata = new RadnikPoDanu();
        Radnik satnica = new RadnikPoSatu();
        Scanner podaciORadniku = new Scanner(System.in);

        System.out.println("Unesite ime radnika: ");
        String ime = podaciORadniku.nextLine();

        fiksnaPlata.setIme(ime);
        dnevnaPlata.setIme(ime);
        satnica.setIme(ime);

        System.out.println("Unesite prezime radnika: ");
        String prezime = podaciORadniku.nextLine();

        fiksnaPlata.setPrezime(prezime);
        dnevnaPlata.setPrezime(prezime);
        satnica.setPrezime(prezime);

        System.out.println("Unesite JMBG radnika: ");
        String jmbg = podaciORadniku.next();

        fiksnaPlata.setJmbg(jmbg);
        dnevnaPlata.setJmbg(jmbg);
        satnica.setJmbg(jmbg);

        System.out.println("Unesite ziro racun radnika: ");
        String ziroRacun = podaciORadniku.next();

        fiksnaPlata.setZiroRacun(ziroRacun);
        dnevnaPlata.setZiroRacun(ziroRacun);
        satnica.setZiroRacun(ziroRacun);

        System.out.println("Unesite platu radnika: ");
        double plata = podaciORadniku.nextDouble();

        fiksnaPlata.setPlata(plata);
        dnevnaPlata.setPlata(plata);
        satnica.setPlata(plata);

        Scanner ispisPlate = new Scanner(System.in);

        System.out.println("Unesite rec iz zagrade kako biste dobili ispis mesecne plate(fiksna), dnevne plate(dnevna) ili plate po satu(satnica).");
        String ispis = ispisPlate.next();


        if (ispis.equals("fiksna")) {
            fiksnaPlata.isplatiPlatu();

        } else if ( ispis.equals("dnevna")) {
            dnevnaPlata.isplatiPlatu();

        } else if (ispis.equals("satnica")){
            satnica.isplatiPlatu();

        } else {
            System.out.println("Uneli ste pogresnu rec!");
        }
    }
}
