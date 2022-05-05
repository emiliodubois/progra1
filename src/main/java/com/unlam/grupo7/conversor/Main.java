/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unlam.grupo7.conversor;

import com.unlam.grupo7.conversor.ux.NewJFrameUI;

/**
 *
 * @author EDUBOIS
 */
public class Main {

    public static void main(String[] args) {        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrameUI().setVisible(true);
            }
        });
    }
}
