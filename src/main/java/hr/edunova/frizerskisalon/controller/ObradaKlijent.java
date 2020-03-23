/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;

import hr.edunova.frizerskisalon.model.Klijent;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.List;

/**
 *
 * @author krpa
 */
public class ObradaKlijent extends Obrada<Klijent> {
    
    public ObradaKlijent(Klijent entitet) {
        super(entitet);
    }
    
    public ObradaKlijent() {
        super();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
     
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    @Override
    public List<Klijent> getPodaci() {
       return session.createQuery("from Klijent").list();
         
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    
}
