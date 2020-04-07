/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author krpa
 */
@Entity
@Table(name = "posjet")
public class Posjet extends Entitet{
    
    //@Column(name = "usluga_sifra")
    //private Integer usluga_sifra;
    
    @ManyToOne
    private Klijent klijent;
    
    @ManyToOne
    private Djelatnik djelatnik;
    
    @Column(name = "datum")
    private Date datum;

    
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Djelatnik getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(Djelatnik djelatnik) {
        this.djelatnik = djelatnik;
    }

    
    @Override
    public String toString() {
        return String.valueOf(datum);
    }
    
    
    
    
}
