package org.example.adt.exercise;

import org.example.adt.definition.ISet;
import org.example.adt.definition.IStack;
import org.example.adt.implementation.normal.Set;

public class SpecialStaticStack {

    private final int[] array;
    private int count;

    public SpecialStaticStack() {
        this.array = new int[10000];
        this.count = 0;
    }

    public void add(int a) {
        this.array[this.count] = a;
        this.count++;
    }

    public void remove() {
        if(count == 0) {
            System.out.println("Error, no se puede desapilar una pila vacia");
            return;
        }
        this.count--;
    }

    public void remove(int top) {
        if (count == 0) {
            System.out.println("Error, no se puede desapilar una pila vacia");
            return;
        }
        if (this.count < top) {
            System.out.println("Error, no se puede desapilar mas elementos de los que la pila contiene");
            return;

        } else if (this.count == top) {
            this.count = 0;

        } else {
            this.count -= Math.abs(top);
        }
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public int getTop() {
        if(count == 0) {
            System.out.println("Error, no se puede obtener el tope de una pila vacia");
            return -1;
        }
        return this.array[this.count - 1];
    }

    public ISet getTop(int top) {
        if(count == 0) {
            System.out.println("Error, no se puede obtener el tope de una pila vacia");
            return new Set(); // error
        }

        if(count < top) {
            System.out.println("Error, no se puede obtener esta cantidad de tope de una pila de cantidad menor");
            return new Set();
        } else {
            ISet setTop = new Set();
            for(int i = this.count - 1 ; i > this.count-top-1 ; i--) {
                setTop.add(this.array[i]);
            }
            return setTop;
        }
    }


}
