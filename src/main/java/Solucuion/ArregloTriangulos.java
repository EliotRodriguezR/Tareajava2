/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solucuion;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class ArregloTriangulos {
    
    public static void main(String[] args) {
        // Crear arreglo de triangulos
        ArrayList<Figuras> listafiguras= new ArrayList();
        Figuras fig[]=new Figuras[7];
        
        //Declarar las figuras que se van a calcular
        
        Triangulo tr1=new Triangulo();
        tr1.base=5;
        tr1.altura=6;
        
     
        Triangulo tr2=new Triangulo();
        tr2.base=8.4f;
        tr2.altura=7;
        
        Cuadrado cr1=new Cuadrado();
        cr1.base=10;
        cr1.altura=6.5f;
        
        Cuadrado cr2=new Cuadrado();
        cr2.base=4;
        cr2.altura=8.3f;
        
        Cuadrado cr3=new Cuadrado();
        cr3.base=4;
        cr3.altura=5.8f;
        
        Circulos circu1=new Circulos();
        circu1.r=8;
        
        
        Circulos circu2=new Circulos();
        circu2.r=4;
                
                
        
        listafiguras.add(tr1);
        listafiguras.add(tr2);
        listafiguras.add(cr1);
        listafiguras.add(cr2);
        listafiguras.add(cr3);
        listafiguras.add(circu1);
        listafiguras.add(circu2);
                
         fig[0]=tr1;
         fig[1]=tr2;
         fig[2]=cr1;
         fig[3]=cr2;
         fig[4]=cr3;
         fig[5]=circu1;
         fig[6]=circu2;
         

         
         /*Invocar el metodo calcular area para cada triangulo
         para ellos ocuparemos un for*/
         
         for (Figuras f:listafiguras) {
             System.out.println("El area de la figura es: "+f.calcularArea()+"cm");
        }
         
    }
    
    
}
