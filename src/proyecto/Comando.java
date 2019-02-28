/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author luckm
 * @param <E>
 */
public class Comando<E> {
    
    private boolean tipo; //if true --> Boletas || if false --> Evento
    private Evento evento;
    private Boletas boleta;
    private StackList<Comando> stackCmd = new StackList<>();

    public Comando(boolean tipo, Evento evento, Boletas boleta) {
        this.tipo = tipo;
        this.evento = evento;
        this.boleta = boleta;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Boletas getBoleta() {
        return boleta;
    }

    public void setBoleta(Boletas boleta) {
        this.boleta = boleta;
    }
    
    
    public void addCmd(Comando c){
        if(stackCmd.size == 0){
            stackCmd.push(c);
        }else{
            stackCmd.push(c);
        }
    }
    
    public void deleteCmd(Comando c){
        stackCmd.pop(c);
        
    }
    
    
    
    
}
