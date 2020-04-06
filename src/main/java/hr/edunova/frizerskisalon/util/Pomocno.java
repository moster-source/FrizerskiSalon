/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.util;

import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.model.Klijent;
<<<<<<< Updated upstream
=======
import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.model.PosjetUsluga;
import hr.edunova.frizerskisalon.model.Usluga;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
>>>>>>> Stashed changes
import org.hibernate.Session;

/**
 *
 * @author krpa
 */
public class Pomocno {
    
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
    
     private static DecimalFormat df(){
        NumberFormat nf = NumberFormat.
                getNumberInstance(new Locale("hr","HR"));
         DecimalFormat dfl = (DecimalFormat) nf;
         dfl.applyPattern("#,###.00");
    return dfl;
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
