public class Exercici7{
    public static void main(String [] args){
        int num_loteriarng;
        int intents = 0;
        int num_loteria= 0;

        num_loteriarng=(int)System.currentTimeMillis()%999;
        
        while (num_loteriarng != num_loteria) {
            intents++;
            num_loteria=(int)(Math.random()*1000);
        }
        System.out.println("El numero de la loteria era " + num_loteriarng + " i el numero de intents ha sigut de " + intents);
    }
}