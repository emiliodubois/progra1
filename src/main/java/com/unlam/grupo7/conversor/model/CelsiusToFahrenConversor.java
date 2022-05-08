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
public class CelsiusToFahrenConversor extends GenericConversor {
    private static final double SCALE1 = 1.8;
    private static final double SCALE2 = 32;

    public CelsiusToFahrenConversor() {
    }
    
        @Override
    public String convertFirstToSecond(String firstvalue) {
        Double first = Double.valueOf(firstvalue);
	return String.valueOf(String.format("%.2f",((first*SCALE1)+SCALE2)));
    }

    @Override
    public String convertSecondToFirst(String secondValue) {
        Double second = Double.valueOf(secondValue);
	return String.valueOf(String.format("%.2f",((second-SCALE2)/SCALE1)));
    }

    @Override
    public String getListText() {
        return "Celsius - Fahrenheit";
    }

    @Override
    public String getFirstLabel() {
        return "Celsius";
    }

    @Override
    public String getSecondLabel() {
        return "Fahrenheit";
    }
	
}
