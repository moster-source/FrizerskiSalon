/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author krpa
 */
@Entity
@Table(name = "posjet")
public class Posjet extends Entitet{
    
    @OneToMany(mappedBy = "posjet")
    private List<PosjetUsluga> posjetusluge = new ArrayList<>();

    @ManyToOne
    private Klijent klijent;
    
    @ManyToOne
    private Djelatnik djelatnik;

    public List<PosjetUsluga> getPosjetusluge() {
        return posjetusluge;
    }

    public void setPosjetusluge(List<PosjetUsluga> posjetusluge) {
        this.posjetusluge = posjetusluge;
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

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public BigDecimal getCijenaUkupno() {
        return cijenaUkupno;
    }

    public void setCijenaUkupno(BigDecimal cijenaUkupno) {
        this.cijenaUkupno = cijenaUkupno;
    }

    private Date datum;
    
    private BigDecimal cijenaUkupno;
    
    
    

    @Override
    public String toString() {
        return String.valueOf(datum);
    }
    
    
}
