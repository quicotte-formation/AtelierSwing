/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Hotel;
import atelierswing.service.HotelService;
import java.util.List;

/**
 *
 * @author formation
 */
public class JPanelListeHotels2 extends javax.swing.JPanel {

    /**
     * Creates new form JPanelListeHotels2
     */
    public JPanelListeHotels2() {
        initComponents();
        
        // Code maison
        
        HotelService service = new HotelService();
        List<Hotel> listeHotels = service.lister();
        
        TableModelHotels model = new TableModelHotels(listeHotels);
        
        this.jtListeHotels.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbAjouter = new javax.swing.JButton();
        jbModifier = new javax.swing.JButton();
        jbSupprimer = new javax.swing.JButton();
        jbChambres = new javax.swing.JButton();
        jspCentre = new javax.swing.JScrollPane();
        jtListeHotels = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jbAjouter.setText("Ajouter");
        jbAjouter.setFocusable(false);
        jbAjouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAjouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAjouterActionPerformed(evt);
            }
        });
        jToolBar1.add(jbAjouter);

        jbModifier.setText("Modifier");
        jbModifier.setFocusable(false);
        jbModifier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbModifier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbModifier);

        jbSupprimer.setText("Supprimer");
        jbSupprimer.setFocusable(false);
        jbSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbSupprimer);

        jbChambres.setText("Gérer les chambres");
        jbChambres.setFocusable(false);
        jbChambres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbChambres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbChambres);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jtListeHotels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jspCentre.setViewportView(jtListeHotels);

        add(jspCentre, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAjouterActionPerformed
        
        JPanelPrincipal parent = (JPanelPrincipal) this.getParent();
        
        parent.remplaceComposantCentral( new JPanelHotel() );
    }//GEN-LAST:event_jbAjouterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAjouter;
    private javax.swing.JButton jbChambres;
    private javax.swing.JButton jbModifier;
    private javax.swing.JButton jbSupprimer;
    private javax.swing.JScrollPane jspCentre;
    private javax.swing.JTable jtListeHotels;
    // End of variables declaration//GEN-END:variables
}
