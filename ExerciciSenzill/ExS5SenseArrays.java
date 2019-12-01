public class ExS5SenseArrays {
    public static void main(String[] args){
        int x=0;
        int array[]= new int[1000];
        int numero;
        Boolean afegir = true;
        String sino;
        int sumapositius = 0;
        int sumanegatius = 0;
        int sumaparells = 0;
        int sumaimparells = 0;
        int quantitatPositius = 0;
        int quantitatNegatius = 0;
        int quantitatParells = 0;
        int quantitatImparells = 0;
  
        do{
            System.out.println(" Digues un numero ");
            numero = Integer.parseInt(System.console().readLine());
            array[x]= numero;
            x++;
            System.out.println(" Vols afegir més numeros a l'array? (S) o (N)?");
            sino = System.console().readLine();

            if(numero >= 0){
                sumapositius = numero + sumapositius;
                quantitatPositius++;
            }
            if(numero <= 0){
                sumanegatius = numero + sumanegatius;
                quantitatNegatius++;
            }
            if(numero % 2 == 0){
                sumaparells = numero + sumaparells;
                quantitatParells++;
            }
            if(numero % 2 == 1){
                sumaimparells = numero + sumaimparells;
                quantitatImparells++;
            }
            if(sino.equalsIgnoreCase("S")); {
                afegir = true;
            }
            if(sino.equalsIgnoreCase("N")){
            afegir = false;
            }
            
        } while(afegir);
        System.out.println("La suma de numeros positius és " + sumapositius + " i la quantitat de numeros positius és de  " + quantitatPositius);
            System.out.println("La suma de numeros negatius és " + sumanegatius + " i la quantitat de numeros negatius és de  " + quantitatNegatius);
            System.out.println("La suma de numeros parells és " + sumaparells + " i la quantitat de numeros parells és de  " + quantitatParells);
            System.out.println("La suma de numeros imparells és " + sumaimparells + " i la quantitat de numeros imparells és de  " + quantitatImparells);
            System.out.println("La mitjana entre tots els numeros és de " + ((sumapositius + sumanegatius +  sumaparells +  sumaimparells ) / (quantitatPositius + quantitatNegatius + quantitatParells + quantitatImparells)) );
    }
}