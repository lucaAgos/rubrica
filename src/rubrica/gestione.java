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
    
    public void aggiungiContatto(String nome, String cognome, long numero, String nomeFile) throws IOException {
        vet.add(new contatto(nome, cognome, numero, nomeFile));
        f = new File("C:\\Users\\Public\\Desktop\\" + nomeFile+".csv");
        f.createNewFile();
        bw=new BufferedWriter(new FileWriter(f,true));
       
        bw.write(vet.get(i));
    }

}
