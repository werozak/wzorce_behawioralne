/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.Bubblesort;
import sort.strategy.Context;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
       /* Wzorzec Stratega */
        //...
       /*long start = System.nanoTime();
       System.out.println("Time: ??");
       long end = System.nanoTime();
       long elapsedTime = end - start; 
        System.out.println(elapsedTime); */
       
       Context context = new Context(new Bubblesort());
       context.execute(dataNonSort);
       
    }
}
/*
ODPOWIEDZI NA PYTANIA:
1)	Proszę o podanie głównego celu zastosowania wzorca strategii.
Wzorzec ten pozwala na wybór jednego z kilku algorytmów, za pomocą tego wzorca 
można dokonać ekstrakcji poszczególnych algorytmów, które wykonują jedno zadanie
na różne sposoby (np. algorytmy sortowania lub aplikacja z mapami, w której można
wybrać jaka trasa ma zostać wybrana – dla samochodu, dla roweru, piesza).  
Pierwotna klasa, która jest nazywana kontekstem zawiera pole, które służy do 
przechowywania informacji o odniesieniu do którejś strategii. Kontekst nie 
odpowiada za wybór algorytmu dla konkretnego zadania, tą informację podaje klient.  
2)	Czy istnieje możliwość zmiany algorytmu w czasie działania programu?
Tak, istnieje taka możliwość za pomocą przypisywania do obiektu różnych podobiektów,
które wykonują określone działania np. sortowanie na różne sposoby, wybór trasy za 
pomocą różnego środka transportu. 
3)	W jaki sposób wzorzec enkapsuluje poszczególne algorytmy?
Wzorzec pozwala tylko na wykorzystanie danych wejściowych, które są prywatne 
za pomocą publicznych  metod. 
4)	Kiedy stosować wzorzec strategii?
Wzorzec ten sprawdza się w przypadku, gdy w programie występuje dużo wariantów algorytmu 
i należy uwzględnić możliwość zmiany wariantu w trakcie działania programu. 


*/