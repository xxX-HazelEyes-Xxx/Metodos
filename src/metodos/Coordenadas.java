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
public class Coordenadas {
    public Integer i;
    public Double x;
    public Double y;
    
    public Coordenadas(){
    }
    
    public Coordenadas(Integer i, Double x, Double y){
        this.i = i;
        this.x = x;
        this.y = y;
    }

    
    
    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    
}
