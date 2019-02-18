/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author luckm
 */
public class Boletas {
    
    public String evento;
    public int id;

    public Boletas(String evento, int id, int precio, char fila, int silla) {
        this.evento = evento;
        this.id = id;
        this.precio = precio;
        this.fila = fila;
        this.silla = silla;
    }

    public Boletas() {
    }
    
    
    public int precio;
    public char fila;
    public int silla;

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }
    
    public Boletas vender(Boletas b){
       
        //Busca la boleta en el arbol de boletas, la elimina,
        //la guarda en una variable temporal y
        //Agrega la boleta a la lista de boletas vendidas
        
        return b;
    }
    
    
    
    
}
