/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author luckm
 */
public class MyArrayList<E> implements Iterable<E> {

    private static final int DEFAULT_SIZE = 10;
    public int size;
    private E[] sequence = (E[]) new Object[10];

    public MyArrayList() {
        this.size = 0;
        ensureCapacity(DEFAULT_SIZE);
    }
    
     public void add(int idx, E element){
        if(sequence.length == size){
            ensureCapacity(size*2+1);
        }
        for (int i = size; i > idx; i--) {
            sequence[i] = sequence[i-1];
        }
        
        this.sequence[idx] = element;
        this.size++;
    }

    private void ensureCapacity(int newSize) {
        if (newSize < size) {
            return;
        }

        E[] oldSequence = sequence;
        E[] newSequence = (E[]) new Object[newSize];
        for (int i = 0; i < size; i++) {
            newSequence[i] = oldSequence[i];
        }
        this.sequence = newSequence;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public E get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        return sequence[idx];
    }
    
    public E remove(int idx){
        E element = get(idx);
        for (int i = idx; i < size ; i++) {
            sequence[i] = sequence[i+1];
        }
        size--;
        return element;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E> {
        
        private int currentPos = 0;
        public ArrayListIterator() {
        }

        @Override
        public boolean hasNext() {
            return currentPos < size;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return sequence[currentPos++];
        }
    }
}
