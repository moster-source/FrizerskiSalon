/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;

import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author krpa
 */
public class ObradaPosjet extends Obrada<Posjet> {
    
    
    public ObradaPosjet(Posjet entitet) {
        super(entitet);
    }

    public ObradaPosjet() {
        super();
    }
    
    @Override
    public Posjet create() throws EdunovaException{
        kontrolaCreate();
        save();
        nakonSpremanja();
        return entitet;
    }
    
    @Override
    public Posjet update() throws EdunovaException{
        kontrolaUpdate();
        save();
        nakonSpremanja();
        
        return entitet;
    }
    
     private void save() {
        session.beginTransaction();
        session.save(entitet);
         entitet.getPosjetusluge().forEach((c)->{
            session.save(c);
        });
        session.getTransaction().commit();
        
    }
    
    public void ocistiUsluge(){
        session.beginTransaction();
        entitet.getPosjetusluge().forEach((c)->{
            session.delete(c);
        });
        
         session.getTransaction().commit();
         entitet.setPosjetusluge(new ArrayList<>());
        //entitet.getPosjetusluge(new ArrayList<>());
    }

    @Override
    protected void kontrolaCreate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaUpdate() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaDelete() throws EdunovaException {
        ocistiUsluge();
    }

    @Override
    public List<Posjet> getPodaci() {
         return session.createQuery("from Posjet").list();
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }

}
