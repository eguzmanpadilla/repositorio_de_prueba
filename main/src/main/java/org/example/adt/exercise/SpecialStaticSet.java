package org.example.adt.exercise;

import org.example.adt.definition.ISet;

import java.util.Random;
/*
modificar el tda conjunto tanto estatico como dinamico para que
al recibir un numero par, si ya existe lo admita
hasta con 3 repeticiones
*/

public class SpecialStaticSet implements ISet {

    private final int[] array;
    private int count;

    public SpecialStaticSet() {
        this.array = new int[10000];
        this.count = 0;
    }

    @Override
    public void add(int a) {
        // pares
        int total = 0;
        if(a%2 == 0) {
           for(int i = 0; i < this.count; i++) {
               if(this.array[i] == a) {
                   total++;
               }
               if(total >= 3) {
                   return;
               }
           }

        } else {
            // impares
            for (int i = 0; i < this.count; i++) {
                if (this.array[i] == a) {
                    return;
                }
            }
        }

        this.array[this.count] = a;
        this.count++;
    }

    @Override
    public void remove(int a) {
        for(int i = 0; i < this.count; i++) {
            if(this.array[i] == a) {
                if(i == this.count - 1) {
                    this.count--;
                    return;
                }
                this.array[i] = this.array[this.count - 1];
                this.count--;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int choose() {
        if(this.count == 0) {
            System.out.println("No se puede elegir un elemento del conjunto vacio");
            return -1;
        }
        int randomIndex = (new Random()).nextInt(this.count);
        return this.array[randomIndex];
    }

    private boolean isEvenThreeTimes(int a) {
        for(int i = 0; i < this.count; i++) {
           if()
        }
    }
}
