/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon;

import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.util.HibernateUtil;
import hr.edunova.frizerskisalon.util.Pomocno;
import hr.edunova.frizerskisalon.view.SplashScreen;
import org.hibernate.Session;

/**
 *
 * @author krpa
 */
public class Start {
    
    public Start(){
        
        //Pomocno.pocetniInsert();
        new SplashScreen().setVisible(true);
        
        //HibernateUtil.getSessionFactory().openSession();
        
        
        /*
        Djelatnik d = new Djelatnik();
        d.setIme("Pero");
        d.setPrezime("perić-đšpćž");
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(d);
        s.getTransaction().commit();
        s.close();
        HibernateUtil.shutdown();
        */
    }
    
    public static void main(String[] args) {
         new Start();
    }
    
   
}
