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
public abstract class GenericConversor<T,K> {
    
    public abstract T convertFirstToSecond(Double firstvalue);
    
    public abstract K convertSecondToFirst();
    
    public abstract String getListText();
    
    public abstract String getFirstLabel();
    
    public abstract String getSecondLabel();
    
}
