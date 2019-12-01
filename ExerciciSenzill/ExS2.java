public class ExS2{
    public static void main(String[] args){
        int numero;
        System.out.println("Escriu un numero");
        numero = Integer.parseInt(System.console().readLine());
        int senars = 0;
        int parells = 0;

        for (int i=0; i<=numero; i++){
            if (i%2==0){
                parells= parells + i;
            }    
            else{
                senars= senars + i;
            }
        }
        // for (int y=0; y<=numero; y++){
        //     if (y%2 !=0){
        //         senars= senars + y;
        //     } 
        // }
        System.out.println("suma dels senars és "+ senars +    " i la suma dels parells és " + parells );
    }
}