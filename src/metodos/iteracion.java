/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Eduardo
 */
public class iteracion {
    public Integer i;
    public Double a;
    public Double x;
    public Double b;
    public Double fa;
    public Double fx;
    public Double fb;
    public Double err;
    
    public iteracion(){
    }
    
    public iteracion(Integer i, Double a, Double x, Double b, Double fa, Double fx , Double fb, Double err){
        this.i =  i;
        this.a = a;
        this.x = x;
        this.b = b;
        this.fa = fa;
        this.fx = fx;
        this.fb = fb;
        this.err = err;
    }
    
    public iteracion(Integer i, Double x, Double err){
        this.i =  i;
        this.x = x;
        this.err = err;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getFa() {
        return fa;
    }

    public void setFa(Double fa) {
        this.fa = fa;
    }

    public Double getFx() {
        return fx;
    }

    public void setFx(Double fx) {
        this.fx = fx;
    }

    public Double getFb() {
        return fb;
    }

    public void setFb(Double fb) {
        this.fb = fb;
    }

    public Double getErr() {
        return err;
    }

    public void setErr(Double err) {
        this.err = err;
    }
    
    
}
