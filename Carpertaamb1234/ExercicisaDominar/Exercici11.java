public class Exercici11{
    public static void main(String[] args){
        int numero;
        int parell;
        System.out.println("Digues un numero per veure si és parell o senar");

        numero = Integer.parseInt( System.console().readLine());

        if (numero % 2 ==0){
            System.out.println("El "  + numero + " és parell");
        }
        else {
            System.out.println("El " + numero + " és senar");
        }
    }
}