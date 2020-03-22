/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.util;

import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.model.Klijent;
import org.hibernate.Session;

/**
 *
 * @author krpa
 */
public class Pomocno {
    
    
    public static void pocetniInsert(){
        HibernateUtil.getSessionFactory().openSession();
        Klijent k = new Klijent();
        k.setIme("Tihomir");
        k.setPrezime("Moslavac");
        k.setTelefon("095-5335388");
        k.setEmail("tmoslavac@gmail.com");
        
        Klijent k2 = new Klijent();
        k2.setIme("Hrvoje");
        k2.setPrezime("Horvat");
        k2.setTelefon("091-5335399");
        k2.setEmail("hhorvat@gmail.com");
        
        Djelatnik d = new Djelatnik();
        d.setIme("Mislav");
        d.setPrezime("Javorivić");
        d.setTelefon("098-5335399");
        d.setEmail("mjavorovic@gmail.com");
        
        Djelatnik d2 = new Djelatnik();
        d2.setIme("Egar");
        d2.setPrezime("Soroš");
        d2.setTelefon("099-8355399");
        d2.setEmail("esoros@gmail.com");
        
               Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(d);
        s.save(d2);
        s.save(k);
        s.save(k2);
        s.getTransaction().commit();
        s.close();
        HibernateUtil.shutdown();
        
        
        
        
        
    
    }
    
}
