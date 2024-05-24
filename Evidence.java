package cz.itnetwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Třída s metodama k zadávání dat od uživatele
 */
public class Evidence {
    private Databaze databaze;
    private Scanner scanner = new Scanner(System.in);

    public Evidence() {
        databaze = new Databaze();
    }

    /**
     * Metoda k přidání pojištěnce, jména,příjmení, věku a telefonu
     */
    public void pridejPojistence() {
        System.out.println("Zadejte jméno: ");
        String jmeno = scanner.nextLine().trim();
        while (jmeno.isEmpty()) {
            System.out.println("Jméno nesmí být prázdné. Zadejte jméno: ");
            jmeno = scanner.nextLine().trim();
        }
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine().trim();
        while (prijmeni.isEmpty()) {
            System.out.println("Příjmení nesmí být prázdné. Zadej příjmení: ");
            prijmeni = scanner.nextLine().trim();
        }
        System.out.println("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Zadejte telefon: ");
        int telefon = Integer.parseInt(scanner.nextLine().trim());
        databaze.pridejPojistence(jmeno, prijmeni, vek, telefon);
        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
    }

    /**
     * Metoda k vyhledání pojištěnce
     */
    public void najdiPojistence() {
        System.out.println("Zadejte jméno: ");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine().trim();

        ArrayList<Pojistenec> nalezeniPojistenci = databaze.najdiPojistence(jmeno, prijmeni);
        if (nalezeniPojistenci.isEmpty()) {
            System.out.println("Pojištenec nenalezen.");
        } else {
            for (Pojistenec pojistenec : nalezeniPojistenci) {
                System.out.println(pojistenec);
            }
        }
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
    }

    /**
     * Metoda sloužící k výpisu všech pojištěnců
     */
    public void vypisVsechnyPojistence() {
        databaze.vypisVsechnyPojistence();
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
    }

    /**
     * Metoda sloužící k designovému výpisu úvodní obrazovky
     */
    public void vypisObrazovky() {
        System.out.println();
        System.out.println("\n---------------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------------");
    }
}
