
package com.capitulo5.herencia;

public class TestAreas {

 
    public static void main(String[] args) {
        // TODO code application logic here
         try{
       // Area a=new Area(new Cuadrado(-4));
   //     System.out.println(a.calcular());
        
        System.out.println("Si se lanza la excepcion nunca veras esta linea");
         }catch(Exception  e){
             System.out.println(e.getMessage());
         }

    }
    
}
