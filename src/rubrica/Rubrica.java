/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author agostinelli.luca
 */
public class Rubrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        gestione g = new gestione();
        int controllo;
        String nome, cognome;
        long numero;
        do {
            System.out.println("premi 1 per aggiungere un contatto alla rubrica");
            System.out.println("prenmi 2 per visualizzare i contatti nella rubrica");
            System.out.println("premi 3 per rimuovere un contatto alla rubrica");
            System.out.println("premi 4 per uscire");
            controllo = sc.nextInt();
            switch (controllo) {
                case 1:
                    System.out.println("inserisici il nome");
                    nome = sc.next();
                    System.out.println("inserisci il cognome");
                    cognome = sc.next();
                    System.out.println("insersci il numero");
                    numero = sc.nextLong();
                    g.aggiungiContatto(nome, cognome, numero);
                    break;
                case 2:
                    g.visualizzaContatti();
                    break;
                case 3:
                    g.visualizzaContatti();
                    System.out.println("inserisici il nome");
                    nome = sc.next();
                    System.out.println("inserisci il cognome");
                    cognome = sc.next();
                    g.rumuoviContato(nome, cognome);
            }

        } while (controllo != 4);

    }

}
