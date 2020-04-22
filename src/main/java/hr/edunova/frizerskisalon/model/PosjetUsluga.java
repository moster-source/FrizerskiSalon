/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author krpa
 */
@Entity
//@Table(name = "posjetusluga")
public class PosjetUsluga extends Entitet {
    
    @ManyToOne
    private Usluga usluga;
    
    @ManyToOne
    private Posjet posjet;
    

    public Usluga getUsluga() {
        return usluga;
    }

    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }

    public Posjet getPosjet() {
        return posjet;
    }

    public void setPosjet(Posjet posjet) {
        this.posjet = posjet;
    }
    
     @Override
    public String toString() {
        return getUsluga().toString();
    }
    
    
    
}
