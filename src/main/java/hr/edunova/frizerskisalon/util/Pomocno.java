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

import hr.edunova.frizerskisalon.model.Usluga;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import org.hibernate.Session;

/**
 *
 * @author krpa
 */
public class Pomocno {
    
    private final static DecimalFormat df = df();
    
       public static String getNazivAplikacije(){
        return "Frizerski Salon";
    }
       
       public static String getFormatDecimalniBroj(BigDecimal b){
       
        return df.format(b);
    }
    
    public static int getCijeliBrojIzStringa(String s){
         try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }
    public static String getBrojString(int i){
        try {
            return String.valueOf(i);
        } catch (Exception e) {
            return "1";
        }
    }
    
       public static BigDecimal getDecimalniBrojIzStringa(String s){
        try {
            return new BigDecimal(df.parse(s).doubleValue());
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
           
    }
    
     private static DecimalFormat df(){
        NumberFormat nf = NumberFormat.
                getNumberInstance(new Locale("hr","HR"));
         DecimalFormat dfl = (DecimalFormat) nf;
         dfl.applyPattern("#,###.00");
    return dfl;
    }
     
     
    public static void pocetniInsert(){
        //HibernateUtil.getSessionFactory().openSession();
        
        Klijent k = new Klijent();
        k.setIme("Tihomir");
        k.setPrezime("Moslavac");
        k.setTelefon("095-5335388");
        k.setEmail("tmoslavac@gmail.com");
        
        
        Klijent k2 = new Klijent();
        k2.setIme("Jadranka");
        k2.setPrezime("Mrvić");
        k2.setTelefon("091-5335399");
        k2.setEmail("hhorvat@gmail.com");
        
        Klijent k3 = new Klijent();
        k3.setIme("Katica");
        k3.setPrezime("Lončarević");
        k3.setTelefon("091-5335399");
        k3.setEmail("k.loncarevic@gmail.com");
        
        Djelatnik d = new Djelatnik();
        d.setIme("Mislav");
        d.setPrezime("Javorivić");
        d.setTelefon("098-5335399");
        d.setEmail("mjavorovic@gmail.com");
        d.setIban("HR4624840087521834354");
        d.setOib("74075141580");
        
        Djelatnik d2 = new Djelatnik();
        d2.setIme("Vesna");
        d2.setPrezime("Soroš");
        d2.setTelefon("099-8355399");
        d2.setEmail("vsoros@gmail.com");
        d2.setIban("HR2123600003475387772");
        d2.setOib("81984353500");
        
        Usluga u = new Usluga();
        u.setNaziv("Muško šišanje bez frizure");
        u.setCijena(new BigDecimal(45));
        
       
        Usluga u2 = new Usluga();
        u2.setNaziv("Muško šišanje sa frizurom");
        u2.setCijena(new BigDecimal(65));
       
        Usluga u3 = new Usluga();
        u3.setNaziv("Žensko šišanje");
        u3.setCijena(new BigDecimal(100));
        
        Usluga u4 = new Usluga();
        u4.setNaziv("Bojanje kose");
        u4.setCijena(new BigDecimal(170));
        
        Usluga u5 = new Usluga();
        u5.setNaziv("Pramenovi");
        u5.setCijena(new BigDecimal(250));
        
        Usluga u6 = new Usluga();
        u5.setNaziv("Feniranje");
        u5.setCijena(new BigDecimal(250));
        
        Usluga u7 = new Usluga();
        u5.setNaziv("Pranje kose");
        u5.setCijena(new BigDecimal(250));
       
        

       Posjet p = new Posjet();
       p.setDatum(new Date());
       p.setDjelatnik(d);
       p.setKlijent(k);
       List<Usluga> m = new ArrayList<>();
       m.add(0, u);
       m.add(1, u2);
       p.setUsluge(m);
       
        
        
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
        s.save(k3);
        s.save(u);
        s.save(u2);
        s.save(u3);
        s.save(u4);
        s.save(u5);
        s.save(u6);
        s.save(u7);
        //s.save(p);
        
        s.save(a);
        s.save(p);
        
        s.getTransaction().commit();
        s.close();
        HibernateUtil.shutdown();
        
        
            
    }
    
}
