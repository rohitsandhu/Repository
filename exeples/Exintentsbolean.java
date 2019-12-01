import java.util.Random;

public class  Exintentsbolean {
    public static void main(String[] args){
        Random r = new Random();
        int numero;

        System.out.println("Digues un numero del 0 al 10");
        numero = Integer.parseInt(System.console().readLine());
        int maquina = r.nextInt(10);
        boolean trobat = false;
        int i = 1;
         while(trobat == false){
             //System.out.println(trobat);
             //System.out.println(maquina);
             //System.out.println(numero);
             System.out.println("Digues un numero del 0 al 10");
             numero = Integer.parseInt(System.console().readLine());
              i++;

             if(maquina == numero){
                 trobat= true;
             }
             //else{
                 //System.out.println("Digues un numero del 0 al 10");
                //numero = Integer.parseInt(System.console().readLine());
                 //i++;
           // }
 }
        System.out.println("Correcte el numero era " + numero + " i t'ha costat " + i + " intents");
    }
}