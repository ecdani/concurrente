/**
 * 
 * PRÁCTICA 2 Clase Cola
 *
 * @author SIR José Antonio Riaza Valverde
 * @author DON Daniel Espinosa Cuevas
 *
 */


package practica21A;

class Productor implements Runnable {
    Cola cola;
            Productor(Cola q){
                this.cola = q;
                new Thread(this, "Productor").start();
            }
    public void run() {
        int i = 0;
        while (true){
            try {
                Thread.sleep((long) (Math.random()*500));
            } catch (InterruptedException ex) {}
            cola.put(++i);
        }
    }
}


