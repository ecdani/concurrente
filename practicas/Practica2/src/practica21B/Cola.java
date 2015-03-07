/**
 * 
 * PRÁCTICA 2 Clase Cola
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */

package practica21B;

public class Cola {
    int n;
    boolean gateteLogico = false;
    
    synchronized int get() {
        if(!gateteLogico) {
            try { wait(); } catch(Exception e) {}
        }
        System.out.println(" Sale: " + n);
        gateteLogico = false;
        notify();
        return n;
    }
    
    synchronized void put(int d) {
        if(gateteLogico) {
            try { wait(); } catch(Exception e) {}
        }
        n = d;
        System.out.println("Entra: " + n);
        gateteLogico = true;
        notify();
    }
}
