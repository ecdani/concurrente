/**
 * 
 * PRÁCTICA 2
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */

package practica21B;

/**
 * Lo que la práctica llama PC
 */
public class Practica2 {

    public static void main(String[] args) {
        Cola cola = new Cola();
        new Productor(cola);
        new Consumidor (cola);
    }
    
}
