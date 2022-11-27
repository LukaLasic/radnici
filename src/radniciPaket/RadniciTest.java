package radniciPaket;

import java.util.Arrays;
import java.util.Scanner;

public class RadniciTest {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        Radnik radnik = new Radnik("Luka","Lasić",1000,"28-11-2022");
        Radnik radnik1 = new Radnik("Danijel","Vasić",2000,"28-11-2022");
        Radnik radnik2 = new Radnik("Pero","Perić",3000,"28-11-2022");

        System.out.println(radnik);
        System.out.println(radnik1);
        System.out.println(radnik2);

        System.out.println("Unesi postotak za koje će se uvećati plaće: ");
        double postotak= sc.nextDouble();
        radnik.PovecajPlacu(postotak);
        radnik1.PovecajPlacu(postotak);
        radnik2.PovecajPlacu(postotak);

        System.out.println(radnik);
        System.out.println(radnik1);
        System.out.println(radnik2);*/

        Radnik [] niz;
        Radnik [] arhiva;
        niz = new Radnik[3];
        arhiva = new Radnik[3];
        niz[0]=new Radnik("Luka","Lasić",1000,"28-11-2022");
        niz[1]=new Radnik("Danijel","Vasić",2000,"28-11-2022");
        niz[2]=new Radnik("Pero","Perić",3000,"28-11-2022");

        for (int i=0;i<3;i++){
            arhiva[i]=niz[i];
        }
        for (int i=0;i<3;i++){
            System.out.println(arhiva[i]);
        }
        for (int i=0;i<3;i++){
            niz[i].PovecajPlacu(5);
            System.out.println(niz[i]);;
        }








    }
}
