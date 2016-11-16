/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import org.nfunk.jep.*;

/**
 *
 * @author Eduardo
 */
public class Funcion {
    JEP parse = new JEP();
    
    
    public Funcion(String func) {
        
        parse.addVariable("x", 0);
        parse.addVariable("y", 0);
        parse.addStandardConstants();
        parse.addStandardFunctions();
        parse.parseExpression(func);
        if (parse.hasError()) {
            System.out.println("¡¡¡ERROR!!!");
            System.out.println(parse.getErrorInfo());
        }

    }

    public double evaluar(double x) {
        
        double fx;
        parse.addVariable("x", x);
        fx = parse.getValue();
        if (parse.hasError()) {
            System.out.println("¡¡¡ERROR!!!");
            System.out.println(parse.getErrorInfo());
        }
        return fx;
    }
    
    public double evaluar(double x, double y) {
        
        double fx;
        parse.addVariable("x", x);
        parse.addVariable("y", y);
        fx = parse.getValue();
        if (parse.hasError()) {
            System.out.println("¡¡¡ERROR!!!");
            System.out.println(parse.getErrorInfo());
        }
        return fx;
    }

    
}
