public class ExS3{
    public static void main(String[] args){
        int numero;
        System.out.println("Escriu un numero");
        numero =Integer.parseInt(System.console().readLine());

        if(numero % 2 == 0){
            System.out.println("El " + numero + " és parell");
        }
            else{
            System.out.println("El "+ numero + " és imparell");
            }

            
        if(numero >= 0 ){
            System.out.println("És "+ numero + " positius");
        }
            else{
            System.out.println("Es "+ numero  +" negatiu");
            }
    }
}   