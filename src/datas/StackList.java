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
public class StackList<E> {

    public int size;
    private E[] sequence = (E[]) new Object[10];
    ArrayList<E> stack = null;

    public StackList() {
        stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(0, element);
    }

    public E pop(E element) {
        return stack.remove(0);
    }

    public E top() {
        return stack.get(0);
    }
}
