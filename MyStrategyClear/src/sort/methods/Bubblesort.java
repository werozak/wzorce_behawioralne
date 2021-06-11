/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Bubblesort implements IStrategy{
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */
   /* @Override  
    public void sortbab(double [] tab) {
        int rozmiar = tab.length;
        int temp = 0;
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 1; j < (rozmiar - i); j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        // http://www.devprog.pl/sortowanie-babelkowe-tablicy/
}
*/

    @Override
    public void sort(double[] tab) {
       int rozmiar = tab.length;
        int temp = 0;
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 1; j < (rozmiar - i); j++) {
                if (tab[j - 1] > tab[j]) {
                    temp = (int) tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
