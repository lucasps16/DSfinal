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
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {

    private BinaryNode<AnyType> root;

    //Creates an empty BST
    public BinarySearchTree() {
        root = null;
    }

    public void insert(AnyType x) {
        root = insert(x, root);
    }

    private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
        if (t == null) {
            return new BinaryNode<>(x, null, null);
        }

        int compare = x.compareTo(t.element);

        if (compare < 0) {
            t.left = insert(x, t.left);
        } else if (compare > 0) {
            t.right = insert(x, t.right);
        } else {
            ;
        }
        return t;

    }

    public void remove(AnyType x) {
        root = remove(x, root);
    }

    private BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {

        if (t == null) {
            return t;
        }

        return t;
    }

    private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {

        if (t == null) {
            return t;
        } else if (t.left == null) {
            return t;
        }
        return findMin(t.left);

    }

    private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {

        if (t != null) {
            while (t.right != null) {
                t = t.right;
            }
        }
        return t;
    }

    public boolean contains(AnyType x) {
        return contains(x, root);
    }

    private boolean contains(AnyType x, BinaryNode<AnyType> t) {
        if (t == null) {
            return false;
        }

        int compare = x.compareTo(t.element);
        if (compare < 0) {
            return contains(x, t.left);
        } else if (compare > 0) {
            return contains(x, t.right);
        } else {
            return true;
        }

    }

    public void printTree(BinaryNode<AnyType> t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }

    private int height(BinaryNode<AnyType> t) {
        if (t == null) {
            return -1;
        } else {
            return 1 + Math.max(height(t.left), height(t.right));
        }
    }

}
