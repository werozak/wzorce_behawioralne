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
public class Selectionsort implements IStrategy{

    @Override
    public void sort(double[] numbers) {
        int n = numbers.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            double temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }
        double n1;
         n1 = numbers.length;
        for (int i=0; i<n1; ++i)
            System.out.print(numbers[i]+" ");
        System.out.println();
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /* @Override
        public void sort(double arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        double n1;
         n1 = arr.length;
        for (int i=0; i<n1; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    */}
 
    // Prints the array
    /*void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
        */
        
 /*
    // Driver code to test above
    public static void main(String args[])
    {
        Selectionsort ob = new Selectionsort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
*/
    // https://www.geeksforgeeks.org/selection-sort/

        

