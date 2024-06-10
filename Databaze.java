package cz.itnetwork;

import javax.sound.midi.Soundbank;
import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Třída pro práci s databází
 */
public class Databaze {
    /**
     * Vytvoření kolekce pojištěnců
     */
    private ArrayList<Pojistenec> pojistenci;

    /**
     * Vytvoření databáze
     */
    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Přidání pojištěnce do databáze
     *
     * @param jmeno    Jméno
     * @param prijmeni Příjmení
     * @param vek      Věk
     * @param telefon  Telefon
     */
    public void pridejPojistence(String jmeno, String prijmeni, int vek, String telefon) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefon));
    }

    /**
     * Hledání pojištěnce v databázi
     *
     * @param jmeno    Jméno
     * @param prijmeni Příjmení
     * @return Vrací hledaného pojištěnce
     */
    public ArrayList<Pojistenec> najdiPojistence(String jmeno, String prijmeni) {
        ArrayList<Pojistenec> nalezeniPojistenci = new ArrayList<>();
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equalsIgnoreCase(jmeno) && pojistenec.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                nalezeniPojistenci.add(pojistenec);
            }
        }
        return nalezeniPojistenci;
    }

    /**
     * Getter pro výpis všech pojištenců
     *
     * @return vrací pojištěnce
     */
    public ArrayList<Pojistenec> getPojistenci() {
        return pojistenci;
    }

}





