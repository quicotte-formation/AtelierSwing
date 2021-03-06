/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Hotel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelHotels extends AbstractTableModel{

    private List<Hotel> hotels;

    private TableModelHotels() {
    }

    public TableModelHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
    
    @Override
    public int getRowCount() {
        
        return hotels.size();
    }

    @Override
    public int getColumnCount() {
        
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Hotel hotel = hotels.get(rowIndex);
        
        if( columnIndex==0 )
            return hotel.getId();
        
        if( columnIndex==1 )
            return hotel.getNom();
        
        return new RuntimeException("Indice de colonne incorrect");
    }

    
    
}
