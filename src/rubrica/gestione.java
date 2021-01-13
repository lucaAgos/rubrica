/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

/**
 *
 * @author agostinelli.luca
 */
public class gestione {

    private Vector<contatto> vet = new Vector();
    private int i = 0;
    private BufferedWriter bw;
    private File f;
    private String userName = System.getProperty("user.name");

    public void aggiungiContatto(String nome, String cognome, long numero) throws IOException {
        vet.add(new contatto(nome, cognome, numero));
        f = new File("C:\\Users\\" + userName + "\\Desktop\\rubrica.csv");
        f.createNewFile();
        bw = new BufferedWriter(new FileWriter(f, true));
        bw.write(vet.get(i).getutto());
        bw.newLine();
        bw.flush();
        bw.close();

    }

    public void visualizzaContatti() {
        for (int i = 0; i < vet.size(); i++) {
            System.out.println(vet.get(i).getutto());
        }

    }

    public void rumuoviContato(String nome, String cognome) throws IOException {

        for (int i = 0; i < vet.size(); i++) {
            if (vet.get(i).getNome().equals(nome) && vet.get(i).getCognome().equals(cognome)) {
                vet.remove(i);
                System.out.println("contatto eliminato");
                bw = new BufferedWriter(new FileWriter(f));
                for (int a = 0; a < vet.size(); a++) {
                    bw.write(vet.get(a).getutto());
                   bw.newLine();
                }
                bw.flush();
                bw.close();
                i = vet.capacity();
            } else if (i == vet.size()-1) {
                System.out.println("contatto non trovato");
            }
        }
    }

}
