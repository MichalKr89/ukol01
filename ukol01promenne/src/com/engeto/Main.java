package com.engeto;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String jmenoAPrijmeni = "Jan Novák";
        int pocetNakupu = 10;
        String sidloFirmy = "Praha";
        Double spotrebaNaKm = 476.8;
        Double delkaUtpKabelu = 25.5;
        LocalDate narozeniKlienta;
        String spz = "7U 80326";
        String ip = "192.168.24.0";

        narozeniKlienta = LocalDate.of(1887,10,22);

        System.out.println("Jméno a Příjmení: "+jmenoAPrijmeni);
        System.out.println("Počet nákupů: "+pocetNakupu);
        System.out.println("Sídlo firmy: "+sidloFirmy);
        System.out.println("Spotřeba vozidla v litrech: "+spotrebaNaKm+" na 100km");
        System.out.println("Délka UTP kabelu na skladech: "+delkaUtpKabelu+"m");
        System.out.println("Datum narození klienta: "+narozeniKlienta);
        System.out.println("SPZ vozidla: "+spz);
        System.out.println("IP ardesa verze 4: "+ip);
    }
}
