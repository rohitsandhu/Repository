public class Exfor{
    public static void main(String[] args){
        int array[] = new int[11];
        int numero;
        System.out.println("Digues un numero i et fem la taula de multiplicar");
        numero = Integer.parseInt(System.console().readLine());

        //array[0]= numero;

        for(int i=0; i<array.length; i++){
            array[i]= numero * i;
            System.out.println( numero + " per " + i + " és " + array[i]); //  array [i] =numero * i
            
        }
    }
}