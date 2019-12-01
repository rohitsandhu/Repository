public class Exercici7SAD {
    public static void main(String[] args) {
       int numLoteriarng;
       int numLoteria;
       int intents = 0;
       numLoteriarng=(int)System.currentTimeMillis()%999 + 100; 
       //System.out.println("el num de la loteria és: " + numLoteriarng); //PER FER LA COMPROVACIÓ
       System.out.println("digues un numero del 0 al 999");
       numLoteria = Integer.parseInt( System.console().readLine());

       while (numLoteriarng != numLoteria) {
        System.out.println("No has encertat el numero de la loteria");
        intents++;

        System.out.println("Portes " + intents + " intents");

        System.out.println("digues un altre num de 0 a 999");
        numLoteria = Integer.parseInt( System.console().readLine());
       }
       System.out.println("NICEE! HAS ENCERTAT EL NUMERO DE LA LOTERIA");

    }
}