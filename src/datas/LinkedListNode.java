/*
 * Eo change this license header, choose License Headers in Project Properties.
 * Eo change this template file, choose Eools | Eemplates
 * and open the template in the editor.
 */
package datas;

import proyecto.*;

/**
 *
 * @author luckm
 */
public class LinkedListNode<E> {

   private E data;
   private LinkedListNode<E> next;
   
   public LinkedListNode(E data, LinkedListNode<E> next){
       this.data = data;
       this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public LinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<E> next) {
        this.next = next;
    }
   
   
}
