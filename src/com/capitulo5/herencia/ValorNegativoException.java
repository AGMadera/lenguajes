/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.capitulo5.herencia;

/**
 *
 * @author T107
 */
public class ValorNegativoException extends Exception {
    
    public ValorNegativoException(){
        super("Lo siento pero no puedes meter un valor negativo");
    }
    
}
