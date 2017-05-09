/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author formation
 */
public class JFramePrincipale extends JFrame {

    public JFramePrincipale() {
        
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.setSize(  400, 300 );
        
        
        this.add( new JPanelPrincipal() );
        
        this.setVisible(true);
    }
}
