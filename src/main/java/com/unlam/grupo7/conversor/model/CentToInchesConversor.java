/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unlam.grupo7.conversor.model;

/**
 *
 * @author EDUBOIS
 */
public class CentToInchesConversor extends GenericConversor {

    public CentToInchesConversor() {
        
    }
    
    @Override
    public Object convertFirstToSecond() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object convertSecondToFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getListText() {
        return "Centimetros a Pulgadas";
    }

    @Override
    public String getFirstLabel() {
        return "Centimetros";
    }

    @Override
    public String getSecondLabel() {
        return "Pulgadas";
    }
    
}
