/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unlam.grupo7.conversor.model;

/**
 *
 * @author EDUBOIS
 */
public class KmToMilesConversor extends GenericConversor {
    
    private static final double MILE = 1.60934;

    public KmToMilesConversor() {
    }
    
        @Override
    public String convertFirstToSecond(String firstvalue) {
        Double first = Double.valueOf(firstvalue);
	return String.valueOf(String.format("%.2f",first/MILE));
    }

    @Override
    public String convertSecondToFirst(String secondValue) {
        Double second = Double.valueOf(secondValue);
	return String.valueOf(String.format("%.2f",second*MILE));
    }

    @Override
    public String getListText() {
        return "Kilometros - Millas";
    }

    @Override
    public String getFirstLabel() {
        return "Kilometros";
    }

    @Override
    public String getSecondLabel() {
        return "Millas";
    }
    
}
