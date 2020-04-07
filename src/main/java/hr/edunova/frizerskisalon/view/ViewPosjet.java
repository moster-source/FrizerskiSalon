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
import java.time.Instant;
import java.util.Date;
import javax.swing.DefaultListModel;

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
        ucitaj();
        //ucitajDjelatnike();
        //ucitajKlijente();
    }
    private void ucitaj() {
        Date g = new Date();
         DefaultListModel<Posjet> m = new DefaultListModel<>();
        obrada.getPodaci(g).forEach(s -> m.addElement(s));
        lstPodaci.setModel(m);
    }
    
     private void ucitajDjelatnike(){
        DefaultListModel<Djelatnik> d = new DefaultListModel<>();
        new ObradaDjelatnik().getPodaci().forEach(s->d.addElement(s));
        lstDjelatnici.setModel(d);
    }
     
     private void ucitajKlijente(){
        DefaultListModel<Klijent> k = new DefaultListModel<>();
        new ObradaKlijent().getPodaci().forEach(s->k.addElement(s));
        lstKlijenti.setModel(k);
    }
         
        private void ucitajVrijednosti() {
        //DefaultListModel<Djelatnik> m = new DefaultListModel<>();
        //obrada.getEntitet().getDjelatnik().getIme().forEach(c->{m.addElement(c);});
        //lstDjelatnici.setModel(m);
       
        }
        private void ucitajUsluge() {
        DefaultListModel<Usluga> k = new DefaultListModel<>();
        new ObradaUsluga().getPodaci().forEach(s->k.addElement(s));
        lstUsluge.setModel(k);
        
    }
        
        private void postaviVrijednosti() {
     
    
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDjelatnici = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstKlijenti = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnIzlistajSveDjelatnike = new javax.swing.JButton();
        btnIzlistajSveKlijente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstUsluge = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        btnDodajNovuPosjetu = new javax.swing.JButton();
        btnIzlistajSveUsluge = new javax.swing.JButton();
        btnObrisiPosjetu = new javax.swing.JButton();
        btnDodajNovog = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jScrollPane2.setViewportView(lstDjelatnici);

        jLabel1.setText("djelatnici");

        jLabel2.setText("posjete");

        jScrollPane3.setViewportView(lstKlijenti);

        jLabel3.setText("klijenti");

        btnIzlistajSveDjelatnike.setText("Svi djelatnici");
        btnIzlistajSveDjelatnike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlistajSveDjelatnikeActionPerformed(evt);
            }
        });

        btnIzlistajSveKlijente.setText("Svi klijenti");
        btnIzlistajSveKlijente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlistajSveKlijenteActionPerformed(evt);
            }
        });

        lstUsluge.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstUslugeValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstUsluge);

        jLabel4.setText("usluge");

        btnDodajNovuPosjetu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodajNovuPosjetu.setText("Dodaj novu posjetu");

        btnIzlistajSveUsluge.setText("Sve usluge");
        btnIzlistajSveUsluge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzlistajSveUslugeActionPerformed(evt);
            }
        });

        btnObrisiPosjetu.setText("Obriši posjetu");

        btnDodajNovog.setText("Dodaj novog");
        btnDodajNovog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNovogActionPerformed(evt);
            }
        });

        jLabel5.setText("Cijena ukupno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("0 kuna");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDodajNovuPosjetu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnObrisiPosjetu, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIzlistajSveKlijente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIzlistajSveUsluge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDodajNovog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnIzlistajSveDjelatnike, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzlistajSveDjelatnike))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIzlistajSveKlijente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDodajNovog)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIzlistajSveUsluge)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajNovuPosjetu)
                    .addComponent(btnObrisiPosjetu))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        //ucitajDjelatnike();
        //ucitajKlijente();
    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnIzlistajSveDjelatnikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlistajSveDjelatnikeActionPerformed
       ucitajDjelatnike();
    }//GEN-LAST:event_btnIzlistajSveDjelatnikeActionPerformed

    private void btnIzlistajSveKlijenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlistajSveKlijenteActionPerformed
       ucitajKlijente();
    }//GEN-LAST:event_btnIzlistajSveKlijenteActionPerformed

    private void btnIzlistajSveUslugeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzlistajSveUslugeActionPerformed
       ucitajUsluge();
    }//GEN-LAST:event_btnIzlistajSveUslugeActionPerformed

    private void btnDodajNovogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNovogActionPerformed
        new ViewKlijent().setVisible(true);
    }//GEN-LAST:event_btnDodajNovogActionPerformed

    private void lstUslugeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstUslugeValueChanged
        
    }//GEN-LAST:event_lstUslugeValueChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajNovog;
    private javax.swing.JButton btnDodajNovuPosjetu;
    private javax.swing.JButton btnIzlistajSveDjelatnike;
    private javax.swing.JButton btnIzlistajSveKlijente;
    private javax.swing.JButton btnIzlistajSveUsluge;
    private javax.swing.JButton btnObrisiPosjetu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<Djelatnik> lstDjelatnici;
    private javax.swing.JList<Klijent> lstKlijenti;
    private javax.swing.JList<Posjet> lstPodaci;
    private javax.swing.JList<Usluga> lstUsluge;
    // End of variables declaration//GEN-END:variables

    
}