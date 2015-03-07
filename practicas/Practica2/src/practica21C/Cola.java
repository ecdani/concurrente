/**
 * 
 * PRÁCTICA 2 Clase Cola
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */

package practica21C;

public class Cola {
    int n;
    int gateteEntero = 0;
    
    synchronized int get() {
        if (gateteEntero == 0) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println(" Sale: " + n);
        if(gateteEntero < 2) {
            gateteEntero++;
        } else {
            gateteEntero = 0;
        }
        notify();
        return n;
    }
    
    synchronized void put(int d) {
        if (gateteEntero > 0) {
            try { wait(); } catch (Exception e) {}
        }
        n = d;
        System.out.println("Entra: " + n);
        gateteEntero++;
        notify();
    }
}
