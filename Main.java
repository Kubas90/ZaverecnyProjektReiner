package cz.itnetwork;

import java.util.Scanner;

/**
 * Hlavní třída pro komunikaci s uživatelem
 */

public class Main {
    public static void main(String[] args) {
        Databaze databaze = new Databaze();
        Scanner scanner = new Scanner(System.in);
        Evidence evidence = new Evidence();
        String volba = "";
        //hlavní cyklus
        while (!volba.equals("4")) {
            evidence.vypisObrazovky();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            //Reakce na volbu
            switch (volba) {
                case "1":
                    evidence.pridejPojistence();
                    break;
                case "2":
                    evidence.vypisVsechnyPojistence();
                    break;
                case "3":
                    evidence.najdiPojistence();
                    break;
                case "4":
                    //Vyskočí z cyklu while a tím ukončí program
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
            System.out.println();
            System.out.println("Pokračujte libovolnou klávesou...");
            scanner.nextLine();
        }
        scanner.close();
    }
}




