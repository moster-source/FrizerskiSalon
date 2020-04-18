/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.frizerskisalon.view;

import hr.edunova.frizerskisalon.controller.ObradaDjelatnik;
import hr.edunova.frizerskisalon.controller.ObradaKlijent;
import hr.edunova.frizerskisalon.controller.ObradaPosjet;
import hr.edunova.frizerskisalon.controller.ObradaUsluga;
import hr.edunova.frizerskisalon.model.Djelatnik;
import hr.edunova.frizerskisalon.model.Klijent;
import hr.edunova.frizerskisalon.model.Posjet;
import hr.edunova.frizerskisalon.model.Usluga;
import hr.edunova.frizerskisalon.util.EdunovaException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author krpa
 */
public class ViewPosjet extends javax.swing.JFrame {
private final ObradaPosjet obrada;
    /**
     * Creates new form ViewPosjet
     */
    public ViewPosjet() {
        initComponents();
        obrada=new ObradaPosjet();
        ucitajUslugeSve();
        ucitajDjelatnike();
        ucitajKlijente();
        ucitaj();
        obrada.setEntitet(new Posjet());
        
        //ucitajDjelatnike();
        //ucitajKlijente();
    }
    private void ucitaj() {
        /*
        Date g = new Date();
         DefaultListModel<Posjet> m = new DefaultListModel<>();
        obrada.getPodaci(g).forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
        */
        DefaultListModel<Posjet> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
        
    }
    
     private void ucitajDjelatnike(){
        DefaultComboBoxModel<Djelatnik> d = new DefaultComboBoxModel<>();
        new ObradaDjelatnik().getPodaci().forEach(s->d.addElement(s));
        cmbDjelatnici.setModel(d);
    }
     
     private void ucitajKlijente(){
        DefaultComboBoxModel<Klijent> m = new DefaultComboBoxModel<>();
        new ObradaKlijent().getPodaci().forEach(s -> m.addElement(s));
        cmbKlijenti.setModel(m);
    }
         
        private void ucitajVrijednosti() {
           
       /*
        obrada.getEntitet().setSmjer(cmbSmjer.getModel()
                .getElementAt(cmbSmjer.getSelectedIndex()));
        
        obrada.getEntitet().setPredavac((Predavac) cmbPredavac.getSelectedItem());
        
        try {
            DefaultListModel<Clan> m = (DefaultListModel<Clan>)lstPolazniciUGrupi.getModel();
            obrada.ocistiClanove();
            for(int i=0;i<m.getSize();i++){
                obrada.getEntitet().getClanovi().add(m.get(i));
            }
        } catch (Exception e) {
        }
        */
       obrada.getEntitet().setDatum(new Date());
       obrada.getEntitet().setDjelatnik((Djelatnik) cmbDjelatnici.getSelectedItem());
        obrada.getEntitet().setKlijent((Klijent) cmbKlijenti.getSelectedItem());
        
        try {
            DefaultListModel<Usluga> m = (DefaultListModel<Usluga>)lstUslugePosjet.getModel();
            obrada.ocistiUsluge();
            for(int i=0;i<m.getSize();i++){
                obrada.getEntitet().getUsluge().add(m.get(i));
            }
        } catch (Exception e) {
        }
        
        }
        
        private void ucitajUslugeSve() {
        DefaultListModel<Usluga> k = new DefaultListModel<>();
        new ObradaUsluga().getPodaci().forEach(s->k.addElement(s));
        lstUsluge.setModel(k);
        
    }
        private void postaviDjelatnika() {
        for (int i = 0; i < cmbDjelatnici.getModel().getSize(); i++) {
            if (cmbDjelatnici.getModel().getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getDjelatnik().getSifra())) {
                cmbDjelatnici.setSelectedIndex(i);
                break;
            }
        }
    }
        
        private void postaviKlijenta() {
        for (int i = 0; i < cmbKlijenti.getModel().getSize(); i++) {
            if (cmbKlijenti.getModel().getElementAt(i).getSifra().equals(
                    obrada.getEntitet().getKlijent().getSifra())) {
                cmbKlijenti.setSelectedIndex(i);
                break;
            }
        }
    }
        
           private void postaviUsluge() {
        DefaultListModel<Usluga> m = new DefaultListModel<>();
        obrada.getEntitet().getUsluge().forEach(c -> {
            m.addElement(c);
        });
        lstUslugePosjet.setModel(m);
    }
        
        private void postaviVrijednosti() {
       //txtNaziv.setText(obrada.getEntitet().getNaziv());
        //txtBrojPolaznika.setText(Pomocno.getFormatCijelogBroja(obrada.getEntitet().getBrojPolaznika()));
        
        //if(obrada.getEntitet().getDatumPocetka()==null){
        //    dpDatumPocetka.setDate(null);
        //}else{
            //dpDatumPocetka.setDate(Pomocno.convertToLocalDateViaInstant(obrada.getEntitet().getDatumPocetka()));
        //}
        
        // ovo bi radilo ako bi uspještno redefinirali equals i hashcode metode na POJO
        //cmbSmjer.setSelectedItem(obrada.getEntitet().getSmjer());
        //postaviSmjer();
        postaviKlijenta();
        postaviDjelatnika();
        postaviUsluge();
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstUsluge = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btnDodajNovuPosjetu = new javax.swing.JButton();
        btnObrisiPosjetu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbDjelatnici = new javax.swing.JComboBox<>();
        cmbKlijenti = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUslugePosjet = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        lblCijena1Usluge = new javax.swing.JLabel();
        btnPromijeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Djelatnik");

        jLabel2.setText("Posjeta");

        jLabel3.setText("Klijent");

        lstUsluge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUslugeMouseClicked(evt);
            }
        });
        lstUsluge.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUslugeValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstUsluge);

        jLabel4.setText("Sve usluge");

        btnDodajNovuPosjetu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodajNovuPosjetu.setText("Nova posjeta");
        btnDodajNovuPosjetu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNovuPosjetuActionPerformed(evt);
            }
        });

        btnObrisiPosjetu.setText("Obriši posjetu");
        btnObrisiPosjetu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiPosjetuActionPerformed(evt);
            }
        });

        jLabel5.setText("cijena usluge");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("0 kuna");

        lstUslugePosjet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUslugePosjetMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstUslugePosjet);

        jLabel7.setText("Usluge na posjetu");

        lblCijena1Usluge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCijena1Usluge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCijena1Usluge.setText("0,0 kuna");

        btnPromijeni.setText("Promijeni");
        btnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromijeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodajNovuPosjetu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromijeni))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4)
                        .addComponent(btnObrisiPosjetu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbDjelatnici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbKlijenti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblCijena1Usluge, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDjelatnici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbKlijenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lblCijena1Usluge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajNovuPosjetu)
                    .addComponent(btnObrisiPosjetu)
                    .addComponent(btnPromijeni))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        obrada.setEntitet(lstPodaci.getSelectedValue());
        if (obrada.getEntitet() == null) {
            return;
        }
        postaviVrijednosti();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void lstUslugeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUslugeValueChanged
        PostaviCijenuUsluge();
    }//GEN-LAST:event_lstUslugeValueChanged

    private void btnDodajNovuPosjetuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNovuPosjetuActionPerformed
         try {
            
            ucitajVrijednosti();
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDodajNovuPosjetuActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }
        
        ucitajVrijednosti();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnObrisiPosjetuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiPosjetuActionPerformed
            if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(null, "Prvo odaberite stavku");
            return;
        }
        try {
            obrada.ocistiUsluge();
            obrada.delete();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(null, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiPosjetuActionPerformed

    private void lstUslugeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUslugeMouseClicked
                if (evt.getClickCount() == 2) {
            
                    
                    int index = lstUsluge.locationToIndex(evt.getPoint());
            Usluga p = lstUsluge.getModel().getElementAt(index);
            
            try {
                DefaultListModel<Usluga> m = (DefaultListModel<Usluga>) lstUslugePosjet.getModel();
              for(int i=0;i<m.getSize();i++){
                  if(m.get(i).getSifra().equals(p.getSifra())){
                      
                      return;
                  }
              } 
            } catch (Exception e) {
            }
             
                      
            Usluga c = new Usluga();
            c.setSifra(p.getSifra());
            //c.(obrada.getEntitet());
            
            DefaultListModel<Usluga> m;
            
            try {
                m= (DefaultListModel<Usluga>) lstUslugePosjet.getModel();
            } catch (Exception e) {
                m = new DefaultListModel<>();
                lstUslugePosjet.setModel(m);
            }
            
            m.addElement(c);
            lstUslugePosjet.repaint();
            
            
            
        }
    }//GEN-LAST:event_lstUslugeMouseClicked

    private void PostaviCijenuUsluge(){
        
        try {
            int p = lstUsluge.getSelectedIndex();
            Usluga u = lstUsluge.getModel().getElementAt(p);
            lblCijena1Usluge.setText(u.getCijena().toString());
        } catch (Exception e) {
        }
        
    }
    
    private void lstUslugePosjetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUslugePosjetMouseClicked
       
        if (evt.getClickCount() == 2) {
            int index = lstUslugePosjet.locationToIndex(evt.getPoint());
            
            DefaultListModel<Usluga> m = (DefaultListModel<Usluga>) lstUslugePosjet.getModel();
            m.remove(index);
            
            lstUslugePosjet.repaint();
            
        }        
        
    }//GEN-LAST:event_lstUslugePosjetMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovuPosjetu;
    private javax.swing.JButton btnObrisiPosjetu;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JComboBox<Djelatnik> cmbDjelatnici;
    private javax.swing.JComboBox<Klijent> cmbKlijenti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCijena1Usluge;
    private javax.swing.JList<Posjet> lstPodaci;
    private javax.swing.JList<Usluga> lstUsluge;
    private javax.swing.JList<Usluga> lstUslugePosjet;
    // End of variables declaration//GEN-END:variables

    
}
