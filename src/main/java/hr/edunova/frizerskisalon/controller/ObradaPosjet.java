/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.controller;

import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.util.EdunovaException;
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
    public List<Posjet> getPodaci() {
       return session.createQuery("from Posjet").list();
         
    }
//     public List<Posjet> getPodaci(String uvjet){
//        return session.createQuery("from Posjet p "
//                + " where (p.datum) like :uvjet ")
//                .setParameter("uvjet", "%" + uvjet + "%")
//                .setMaxResults(20).list();
//    }
         public List<Posjet> getPodaci(Date uvjet){
       return session.createQuery("from Posjet p").setMaxResults(100).list();
                //.setParameter("uvjet", "%" + uvjet + "%")
                //.setMaxResults(20).list();
    }
        

    @Override
    protected void nakonSpremanja() throws EdunovaException {
       
    }
    
    
}
