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

	private static final double INCH = 2.54;

    public CentToInchesConversor() {
        
    }

    @Override
    public String convertFirstToSecond(String firstvalue) {
        Double first = Double.valueOf(firstvalue);
	return String.valueOf(first/INCH);
    }


    @Override
    public String convertSecondToFirst(String secondValue) {
        Double second = Double.valueOf(secondValue);
	return String.valueOf(second*INCH);
    }

    @Override
    public String getListText() {
        return "Centimetros - Pulgadas";
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
