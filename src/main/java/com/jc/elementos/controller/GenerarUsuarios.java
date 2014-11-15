
package com.jc.elementos.controller;

import java.util.ArrayList;


public class GenerarUsuarios {
   public static ArrayList<Usuario> obtenerUsuario(){
       ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
       
       //primero creamos tres direcciones
       Direccion d1=new Direccion("calle","Azteca","Mexico",1234567);
       Direccion d2=new Direccion("calle 1","Muzquiz","Oaxaca",123456);
       Direccion d3=new Direccion("calle 2","Aragon","Chiapas",12345);
       
       //Ahora asignamos las direcciones a sus usuarios
       
       Usuario u1=new Usuario("Carlos",30,30000,d1);
       Usuario u2=new Usuario("Manuel",42,41000,d2);
       Usuario u3=new Usuario("Luis",22,55000,d3);
       usuarios.add(u1);
       usuarios.add(u2);
       usuarios.add(u3);
       
       return usuarios;
       
   } 
}
