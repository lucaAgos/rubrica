/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

/**
 *
 * @author agostinelli.luca
 */
public class contatto {
 private String nome;
 private String cognome;
 private long numero;
private String nomeFile;
   

   public contatto(String nome, String cognome, long numero,String nomeFile) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
        this.nomeFile=nomeFile;
    }

 

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
  
    public String getNomeFile(){
        return nomeFile;
    }



}
