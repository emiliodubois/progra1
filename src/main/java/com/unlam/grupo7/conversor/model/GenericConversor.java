/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unlam.grupo7.conversor.model;

/**
 *
 * @author EDUBOIS
 * @param <T>
 * @param <K>
 */
public abstract class GenericConversor {
    
    public abstract String convertFirstToSecond(String string) throws NumberFormatException;
    
    public abstract String convertSecondToFirst(String string) throws NumberFormatException;
    
    public abstract String getListText();
    
    public abstract String getFirstLabel();
    
    public abstract String getSecondLabel();
    
}
