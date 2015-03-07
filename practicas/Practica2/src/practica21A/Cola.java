/**
 * 
 * PRÁCTICA 2 Clase Cola
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */

package practica21A;

public class Cola {
    int n;
    volatile boolean gateteLogico = false; // Volatile es mágico (devuelve lo último)
    
    int get() {
        while(!gateteLogico) {}
        System.out.println(" Sale: " + n);
        gateteLogico = false;
        return n;
    }
    
    void put(int d) {
        while(gateteLogico) {}
        n = d;
        System.out.println("Entra: " + n);
        gateteLogico = true;
    }
}
