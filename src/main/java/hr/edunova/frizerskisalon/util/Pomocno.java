/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.util;

import hr.edunova.frizerskisalon.model.Administrator;
import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.model.Klijent;
import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.model.PosjetUsluga;
import hr.edunova.frizerskisalon.model.Usluga;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author krpa
 */
public class Pomocno {
    
       public static String getNazivAplikacije(){
        return "Frizerski Salon";
    }
    
    
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
        
        Usluga u = new Usluga();
        u.setNaziv("Muško šišanje bez frizure");
        u.setCijena(new BigDecimal(45));
        u.setKolicina(1);
        
        Usluga u2 = new Usluga();
        u2.setNaziv("Muško šišanje sa frizurom");
        u2.setCijena(new BigDecimal(65));
        u2.setKolicina(1);
        
        Usluga u3 = new Usluga();
        u3.setNaziv("Žensko šišanje");
        u3.setCijena(new BigDecimal(100));
        u3.setKolicina(1);
        
        Usluga u4 = new Usluga();
        u4.setNaziv("Bojanje kose");
        u4.setCijena(new BigDecimal(170));
        u4.setKolicina(1);
        
        Usluga u5 = new Usluga();
        u5.setNaziv("Pramenovi");
        u5.setCijena(new BigDecimal(250));
        u5.setKolicina(1);
        
        Posjet p = new Posjet();
        p.setDatum(new Date());
        p.setDjelatnik(d);
        p.setKlijent(k);
        
        Posjet p2 = new Posjet();
        p.setDatum(new Date());
        p.setDjelatnik(d2);
        p.setKlijent(k2);
        
        
        PosjetUsluga pu = new PosjetUsluga();
        pu.setPosjet(p);
        pu.setUsluga(u);
        
        Administrator a = new Administrator();
        a.setIme("Marko");
        a.setPrezime("Marić");
        a.setTelefon("099-1618555");
        a.setEmail("mmaric@gmail.com");
        
        
        
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(d);
        s.save(d2);
        s.save(k);
        s.save(k2);
        s.save(u);
        s.save(u2);
        s.save(u3);
        s.save(u4);
        s.save(u5);
        s.save(p);
        s.save(pu);
        s.save(a);
        
        
        s.getTransaction().commit();
        s.close();
        HibernateUtil.shutdown();
        
        
        
        
        
    
    }
    
}
