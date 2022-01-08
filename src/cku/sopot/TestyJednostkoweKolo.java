package cku.sopot;

import java.util.Scanner;

public class TestyJednostkoweKolo {
    static float promien;
    static float obwod;
    static float pole;

    public static void main(String[] args) {
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        promien = daneWejsciowe.nextFloat();
        //zakładamy instancję klasy
        Kolo kolo = new Kolo(promien);
        obwod = kolo.obliczObwod();
        pole = kolo.obliczPole();
        //wypisuje komunikat
        System.out.print("Koło o promieniu: "+ promien);
        System.out.println(" ma obwód " + obwod + " oraz pole: " + pole);
        //obwod: 62.83 oraz pole 314.15002
    }
}
