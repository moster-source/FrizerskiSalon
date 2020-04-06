/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;


import hr.edunova.frizerskisalon.model.PosjetUsluga;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.List;

/**
 *
 * @author krpa
 */
public class ObradaPosjetUsluga extends Obrada<PosjetUsluga>{
    
    public ObradaPosjetUsluga(PosjetUsluga entitet) {
        super(entitet);
    }
    
    public ObradaPosjetUsluga() {
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
    public List<PosjetUsluga> getPodaci() {
       return session.createQuery("from PosjetUsluga").list();
         
    }

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    
    
}
