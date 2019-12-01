public class ExWhile{
    public static void main(String[] args){
        int array[] = new int[11];
        int numero;
        System.out.println("Digues un numero i et fem la taula de multiplicar");
        numero = Integer.parseInt(System.console().readLine());
        int it = 0;
        while(it < array.length){
            array[it]=numero * it;
            System.out.println(numero + " per " + it + " és " + array[it]);
            it++;
        }
    }
}