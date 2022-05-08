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
public class MBToGBConversor extends GenericConversor {
    private static final double VALUE = 1000;

    public MBToGBConversor() {
    }
    
        @Override
    public String convertFirstToSecond(String firstvalue) {
        Double first = Double.valueOf(firstvalue);
	return String.valueOf(String.format("%.2f",first/VALUE));
    }

    @Override
    public String convertSecondToFirst(String secondValue) {
        Double second = Double.valueOf(secondValue);
	return String.valueOf(String.format("%.2f",second*VALUE));
    }

    @Override
    public String getListText() {
        return "Megabytes - Gigabytes";
    }

    @Override
    public String getFirstLabel() {
        return "Megabytes";
    }

    @Override
    public String getSecondLabel() {
        return "Gigabytes";
    }	
	
}
