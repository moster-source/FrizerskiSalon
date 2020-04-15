/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author krpa
 */
@Entity
@Table(name = "djelatnik")
public class Djelatnik extends Entitet{
    
   
    private String ime;
    private String prezime;
    private String telefon;
    private String email;
    private String oib;
    private String iban;
  
       
    
        public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
    @Override
    public String toString() {
        return ime + " " + prezime;
    }
    
    
    
}
