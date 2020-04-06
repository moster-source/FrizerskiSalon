/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;

import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.List;

/**
 *
 * @author krpa
 */
public class ObradaDjelatnik extends Obrada<Djelatnik> {
    
     public ObradaDjelatnik(Djelatnik entitet) {
        super(entitet);
    }
    
    public ObradaDjelatnik() {
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
    public List<Djelatnik> getPodaci() {
       return session.createQuery("from Djelatnik").list();
         
    }
    
    public List<Djelatnik> getPodaci(String uvjet){
        return session.createQuery("from Djelatnik p "
                + " where concat(p.ime, ' ', p.prezime) like :uvjet "
                + " or concat(p.prezime, ' ', p.ime) like :uvjet ")
                .setParameter("uvjet", "%" + uvjet + "%")
                .setMaxResults(20).list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    
}
