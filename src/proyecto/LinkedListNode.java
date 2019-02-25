/*
 * Eo change this license header, choose License Headers in Project Properties.
 * Eo change this template file, choose Eools | Eemplates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author luckm
 */
public class LinkedListNode<E> {
    private E value;
    private LinkedListNode<E> next;

    public LinkedListNode(E value) {
        this.value = value;
    }
    
    public void setNext(LinkedListNode<E> next) {
		this.next = next;
	}

	public LinkedListNode<E> getNext() {
		return next;
	}

	public E getValue() {
		return value;
	}
    
    
    
}
