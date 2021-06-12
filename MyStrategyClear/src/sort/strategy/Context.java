/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

import sort.methods.IStrategy;

/**
 *
 * @author InteXPC
 */
public class Context {
    private IStrategy strategy;
    
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    
    public void execute(double [] numbers){
        strategy.sort(numbers);
    }
    
}
