import java.util.Random;

public class Exintents{
    public static void main(String[] args){
        Random r = new Random();
        int numero;
        System.out.println("Digues un numero del 0 al 10");
        numero = Integer.parseInt(System.console().readLine());
        int maquina = r.nextInt(10);
        int i = 1;
        
        while(maquina != numero){
            System.out.println("Digues un numero del 0 al 10");
            numero = Integer.parseInt(System.console().readLine());
            i++;
        }
        System.out.println("Correcte el numero era " + numero + " i t'ha costat " + i + " intents");
    }
}