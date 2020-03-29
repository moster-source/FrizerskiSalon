/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author krpa
 */
@Entity
@Table(name = "usluga")
public class Usluga extends Entitet{
    
    private String naziv;
    private BigDecimal cijena;
    private Integer kolicina;

    public Integer getKolicina() {
        return kolicina;
    }

    public void setKolicina(Integer kolicina) {
        this.kolicina = kolicina;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }
    
    
}
