package org.example;

import org.example.adt.definition.ISet;
import org.example.adt.implementation.normal.Dictionary;
import org.example.adt.implementation.normal.Set;

public class Main {
    public static void main(String[] args) {
        /*
        dado dos diccionarios d1 y d2 generar un nuevo diccionario
        d3 con llos elementos en comun entre d1 y d2.
         */
        /*
        Dictionary d1 = new Dictionary();
        d1.add(2,3);
        d1.add(4,1);
        d1.add(7,5);
        d1.add(9,8);
        d1.add(5,0);

        Dictionary d2 = new Dictionary();
        d2.add(8,3);
        d2.add(3,5);
        d2.add(6,15);
        d2.add(1,4);
        d2.add(9,8);
        d2.add(80,1);


        Dictionary d3 = dictionaryIntersection(d1, d2);
        printDictionaryValues(d3);
         */

        /*
        modificar el tda conjunto tanto estatico como dinamico para que
        al recibir un numero par, si ya existe lo admita
        hasa con 3 repeticiones
         */






        /*
        crear un tda pila con tope variable, donde el tope son N
        elementos de la pila.
         */

    }

    /*
    public static Dictionary dictionaryIntersection(Dictionary D1, Dictionary D2) {
        Dictionary D3 = new Dictionary();
        if(!(D1.isEmpty() || D2.isEmpty())) {
            ISet set = D1.getKeys();
            while(!set.isEmpty()) {
                int element = set.choose();
                if(aBelongsToDictionary(D1.getValue(element), D2)) {
                    D3.add(element, D1.getValue(element));
                }
                set.remove(element);
            }
        }
        return D3;
    }

    private static boolean aBelongsToDictionary(int value, Dictionary dictionary) {
        ISet keys = dictionary.getKeys();
        while(!keys.isEmpty()) {
            int key = keys.choose();
            if(dictionary.getValue(key) == value )
                return true;
            keys.remove(key);
        }
        return false;
    }

    public static void printDictionaryValues(Dictionary dictionary) {
        ISet keys = dictionary.getKeys();
        while(!keys.isEmpty()) {
            int key = keys.choose();
            System.out.println(dictionary.getValue(key));
            keys.remove(key);
        }
    }
     */










}