/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import proyecto.*;

/**
 *
 * @author luckm
 */
public class LinkedList<E> {
    
    private LinkedListNode<E> front;
    private LinkedListNode<E> back;
    private int listSize;
    
    public LinkedList(){
        this.front = null;
        this.back = null;
        this.listSize = 0;
    }
    
    public boolean empty(){
        return(this.listSize == 0);
    }
    
    public int size(){
        return this.listSize;
        
    }
    
    public E peek(){
        if(this.empty()){
            throw(new java.util.NoSuchElementException("La lista esta vacia"));
        }else{
            return this.front.getData();
        }
    }

    
    
}
