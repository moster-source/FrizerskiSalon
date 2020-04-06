/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;

import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.model.Usluga;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.List;

/**
 *
 * @author krpa
 */
public class ObradaUsluga extends Obrada<Usluga> {
     public ObradaUsluga(Usluga entitet) {
        super(entitet);
    }
    
    public ObradaUsluga() {
        super();
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
    //super.kontrolaCreate();
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        
    }

    @Override
    public List<Usluga> getPodaci() {
       return session.createQuery("from Usluga").list();
         
    }
     public List<Usluga> getPodaci(String uvjet){
        return session.createQuery("from Usluga p "
                + " where (p.naziv) like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20).list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    
}
