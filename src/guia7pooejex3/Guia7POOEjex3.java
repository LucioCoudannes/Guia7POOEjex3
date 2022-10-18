/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooejex3;

import Entidades.Raices;
import Servicios.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia7POOEjex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        RaicesServicio rs = new RaicesServicio();

        Raices obj1 = new Raices();

        System.out.println("Ingrese el valor de A");
        obj1.setA(leer.nextInt());

        System.out.println("Ingrese el valor de B");
        obj1.setB(leer.nextInt());

        System.out.println("Ingrese el valor de C");
        obj1.setC(leer.nextInt());

        rs.Discriminante(obj1, obj1, obj1);

        System.out.println(obj1.toString());

        rs.tieneRaices();

        if (rs.tieneRaices() == true) {

            System.out.println("VERDADERO");

        } else {

            System.out.println("FALSO");

        }

        rs.tieneRaiz();

        if (rs.tieneRaiz() == true) {

            System.out.println("VERDADERO");

        } else {

            System.out.println("FALSO");

        }
        
       rs.calcular(obj1, obj1, obj1);
        
        
                
        

    }

}
