/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author A288808
 */
public class RaicesServicio {

    double resultado;

    public double Discriminante(Raices a, Raices b, Raices c) {

        resultado = (Math.pow(b.getB(), 2)) - (4 * a.getA() * c.getC());

        return resultado;

    }

    public Boolean tieneRaices() {

        return resultado >= 0;

    }

    public Boolean tieneRaiz() {

        return resultado == 0;

    }

    public void obtenerRaices(Raices a, Raices b, Raices c) {

        if (this.tieneRaices()) {

            System.out.println("El valor de la discriminante es " + (Math.pow(b.getB(), 2) - 4 * a.getA() * c.getC()));

            System.out.print("El prmier resultado es ");
            System.out.println((-b.getB() + Math.sqrt(this.Discriminante(a, b, c))) / (2 * a.getA()));
//            System.out.println((-b.getB() + Math.sqrt(Math.pow(b.getB(), 2) - 4 * a.getA() * c.getC())) / (2 * a.getA()));
            System.out.print("El segundo resultado es ");
            System.out.println((-b.getB() - Math.sqrt(this.Discriminante(a, b, c))) / (2 * a.getA()));
//            System.out.println((-b.getB() - Math.sqrt(Math.pow(b.getB(), 2) - 4 * a.getA() * c.getC())) / (2 * a.getA()));

        } else {

            System.out.println("No tiene raiz");
        }

    }

    public void obtenerRaiz(Raices a, Raices b, Raices c) {

        if (this.tieneRaiz()) {

            System.out.print("EL unico valor posible es ");
            System.out.println((-b.getB() - Math.sqrt(0)) / (2 * a.getA()));

        }

    }
    
    public void calcular(Raices a, Raices b, Raices c){
        
        this.obtenerRaices(a, b, c);
        this.obtenerRaiz(a, b, c);
        
        
    }
    
    

}
