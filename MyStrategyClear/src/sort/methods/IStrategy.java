/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author InteXPC
 */
public interface IStrategy {
    void sort(double [] numbers);
    String getType();
}
/*
public class Bubblesort implements IStrategy {
    @Override
    public void sort(double [] numbers){
        
    }

}
*/

