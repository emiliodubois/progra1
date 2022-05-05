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
    
    protected String labelFirst;
    
    private String labelSecond;
    
    private T valueFirst;
    
    private K valueSecond;
    
    public abstract T convertFirstToSecond();
    
    public abstract K convertSecondToFirst();
    
}
