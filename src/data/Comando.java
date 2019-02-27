/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import proyecto.*;

/**
 *
 * @author luckm
 * @param <E>
 */
public class Comando<E> {
    
    public E tipo;
    public StackList<E> historial = new StackList<>();
    
    
}
