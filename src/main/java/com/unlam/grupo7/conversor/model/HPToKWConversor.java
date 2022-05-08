/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unlam.grupo7.conversor.model;

/**
 *
 * @author juhan
 */
public class HPToKWConversor extends GenericConversor {


    public HPToKWConversor() {
    }
    
        @Override
    public String convertFirstToSecond(String firstvalue) {
        Double first = Double.valueOf(firstvalue);
	return String.valueOf(String.format("%.2f",first*0.745699872));
    }

    @Override
    public String convertSecondToFirst(String secondValue) {
        Double second = Double.valueOf(secondValue);
	return String.valueOf(String.format("%.2f",second*1.34102209));
    }

    @Override
    public String getListText() {
        return "Caballo de Fuerza - Kilovatios";
    }

    @Override
    public String getFirstLabel() {
        return "Caballo de Fuerza";
    }

    @Override
    public String getSecondLabel() {
        return "Kilovatios";
    }		
	
}
