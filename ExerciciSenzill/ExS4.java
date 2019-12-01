public class ExS4{
    public static void main(String[] args){
        int array[]= new int[5];
        int suma = 0;
        for(int i=0; i<array.length; i++){
            System.out.println("Digues un numero");
            int numero = Integer.parseInt(System.console().readLine());
            array[i]= numero;
            suma = array[i] + suma;
        }
        System.out.println("\n " +  "L'array al reves és " );

        for (int y=4; y >=0;y--){
            System.out.println(array[y]);
        }
        System.out.println( "\n" + "I la suma és " + suma);
    }
}