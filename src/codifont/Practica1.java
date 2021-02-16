/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

import java.util.Arrays;

/**
 *
 * @author alumne
 */
public class Practica1 {

    public static void main(String[] args) {
        //El canvi és aquest comentari

        //Prova1: retornarà null i v1 contindrà [ 3, 4, 5, 6]
        int[] v1 = new int[]{1, 2, 3, 4};
        System.out.println("Prova1: (v1, 2, true)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v1, 2, true)));
        System.out.println("v1 conté: "+Arrays.toString(v1));
        System.out.println();

        //Prova2: retornarà un vector que contindrà [ 3, 4, 5, 6] i v2 contindrà [ 1, 2, 3, 4]
        int[] v2 = new int[]{1, 2, 3, 4};
        System.out.println("Prova2: (v2, 2, false)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v2, 2, false)));
        System.out.println("v2 conté: "+Arrays.toString(v2));
        System.out.println();
        
        //Prova3: retornarà null
        System.out.println("Prova3: (null, 2, true)");
        System.out.println("Retorna "+Arrays.toString(operaVector (null, 2, true)));
        System.out.println();
        
        //Prova4: retornarà null
        System.out.println("Prova4: (null, 2, false)");
        System.out.println("Retorna "+Arrays.toString(operaVector (null, 2, false)));
        System.out.println();
        
        //Prova5: retornarà null i v5 contindrà [ -1, 0, 1, 2]
        int[] v5 = new int[]{1, 2, 3, 4};
        System.out.println("Prova5: (v5, -2, true)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v5, -2, true)));
        System.out.println("v5 conté: "+Arrays.toString(v5));
        System.out.println();
        
        //Prova6: retornarà un vector que contindrà [ -1, 0, 1, 2] i v6 contindrà [ 1, 2, 3, 4]
        int[] v6 = new int[]{1, 2, 3, 4};
        System.out.println("Prova6: (v6, -2, false)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v6, -2, false)));
        System.out.println("v6 conté: "+Arrays.toString(v6));
        System.out.println();
        
        //Prova7: retornarà null i v7 contindrà [ 1, 2, 3, 4]
        int[] v7 = new int[]{1, 2, 3, 4};
        System.out.println("Prova7: (v7, 0, true)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v7, 0, true)));
        System.out.println("v7 conté: "+Arrays.toString(v7));
        System.out.println();
        
        //Prova7: retornarà un vector que contindrà [ 1, 2, 3, 4] i v8 contindrà [ 1, 2, 3, 4]
        int[] v8 = new int[]{1, 2, 3, 4};
        System.out.println("Prova8: (v8, 0, false)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v8, 0, false)));
        System.out.println("v8 conté: "+Arrays.toString(v8));
        System.out.println();
        
        //Prova9: retornarà null i v9 contindrà [ 4, 3, 2, 1]
        int[] v9 = new int[]{-1, -2, -3, -4};
        System.out.println("Prova9: (v9, 5, true)");
        System.out.println("Retorna "+Arrays.toString(operaVector(v9, 5, true)));
        System.out.println("v9 conté: "+Arrays.toString(v9));
        System.out.println();
        
    }

    public static int[] operaVector(int[] vector, int quantitat, boolean canvis) {
        //Declaració de variables del mètode operaVector
        int[] resultat;

        if (vector != null) {
            if (canvis) {
                for (int i = 0; i < vector.length; i++) {
                    vector[i] += quantitat;
                }
                return null;
            } else {

                //Creo un vector de la mateixa llargada que el rebut per paràmetre
                resultat = new int[vector.length];
                for (int i = 0; i < resultat.length; i++) {
                    resultat[i] = vector[i] + quantitat;
                }

                return resultat;
            }
        } else {
            return null;
        }
    }
}
