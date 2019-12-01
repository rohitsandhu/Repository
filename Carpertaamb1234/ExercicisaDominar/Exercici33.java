public class Exercici33 {
    public static void main(String[] args) {
        int numero;
        int divisions = 0;
        boolean esPrimer = false;
        numero = Integer.parseInt(System.console().readLine());

        for( int i=1; i<=numero; i++){
            if(numero%i==0){
                divisions++;
            }
            if(divisions == 2){
                esPrimer = true;
            }
            else{
                esPrimer = false;
            }
        }


        if (esPrimer==true){
            System.out.println("el numero és primer");
        }
        else{
            System.out.println("el numero NO  és primer");
        }
    }
}