/**
 * 
 * PRÁCTICA 2 Clase Cola
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */


package practica21B;

public class Consumidor implements Runnable{
    Cola cola;
    int n;
    Consumidor (Cola q) {
        this.cola = q;
        new Thread(this, "Consumidor").start();
    }
    public void run(){
        while(true) {
            try{
                Thread.sleep((long)(Math.random()*500));
            } catch (InterruptedException ex) {}
            n = cola.get();
        }
    }
}
