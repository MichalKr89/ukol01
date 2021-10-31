package com.engeto;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Host hostMalikova = new Host("Adéla", "Malíková", LocalDate.of(1998,3,13));
        Host hostDvoracek = new Host("Jan", "Dvořáček", LocalDate.of(1995,5,5));

        System.out.println("Jméno: " +hostMalikova.getFirstName()+ ", Příjmení: " +hostMalikova.getSureName()+ ", Datum narození: " +hostMalikova.getDateOfBirth());
        System.out.println("Jméno: " +hostDvoracek.getFirstName()+ ", Příjmení: " +hostDvoracek.getSureName()+ ", Datum narození: " + hostDvoracek.getDateOfBirth());

        Room room1 = new Room(1,true,true, 1000);
        Room room2 = new Room(1,true,true, 1000);
        Room room3 = new Room(3,false,true, 2400);

        System.out.println("Pokoj č.1." +
            "Počet postelí: " +room1.getNumberOfBeds()+ ", Balkón: " +room1.getBalcony()+ ", Výhled na moře: " +room1.getViewOnSea()+ ", Cena za noc: " +room1.getPricePerNight());
        System.out.println("Pokoj č.2." +
                "Počet postelí: " +room2.getNumberOfBeds()+ ", Balkón: " +room2.getBalcony()+ ", Výhled na moře: " +room2.getViewOnSea()+ ", Cena za noc: " +room2.getPricePerNight());
        System.out.println("Pokoj č.3." +
                "Počet postelí: " +room3.getNumberOfBeds()+ ", Balkón: " +room3.getBalcony()+ ", Výhled na moře: " +room3.getViewOnSea()+ ", Cena za noc: " +room3.getPricePerNight());

        Reservation reservation1 = new Reservation("Adéla Malíková", 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
        Reservation reservation2 = new Reservation("Adéla Malíková a Jan Dvořáček", 3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));

        System.out.println("Rezervace pokoje č.: " +reservation1.getRoomNumber()+ ", na jméno: " +reservation1.getNameOfVisitor()+ ", Od: " +reservation1.getFirstDay()+ ", Do: " +reservation1.getLastDay());
        System.out.println("Rezervace pokoje č.: " +reservation2.getRoomNumber()+ ", na jméno: " +reservation2.getNameOfVisitor()+ ", Od: " +reservation2.getFirstDay()+ ", Do: " +reservation2.getLastDay());
    }

}
