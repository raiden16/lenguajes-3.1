/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

/**
 *
 * @author T107
 */
public class ServicioSuperficie {
    Superficie superficie;

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    public ServicioSuperficie() {
    }
    public String ServicioArea(){
     return superficie.calcularArea();
    }
}
