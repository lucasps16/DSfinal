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
public class BinaryNode<AnyType> {
    
    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;

    public BinaryNode(AnyType E) {
        this(E, null,null);
    }

    public BinaryNode(AnyType E, BinaryNode<AnyType> left, BinaryNode<AnyType> right) {
        element = E;
        this.left = left;
        this.right = right;
        
    
    }
    
    
    
    
    
}
