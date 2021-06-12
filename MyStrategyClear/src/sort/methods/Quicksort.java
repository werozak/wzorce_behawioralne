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
public class Quicksort implements IStrategy{
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html */
   // @Override
    public int sort(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);

    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;

            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }

    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;

    return i+1;
}
    
    public void sortqu(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = sort(arr, begin, end);

        sortqu(arr, begin, partitionIndex-1);
        sortqu(arr, partitionIndex+1, end);
    }
}
    // https://www.baeldung.com/java-quicksort

    @Override
    public void sort(double[] numbers) {
        
    }

    @Override
    public String getType() {
        
        return null;
        
    }
}
