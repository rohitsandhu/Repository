public class ExS6 {
    public static void main(String[] args) {
        System.out.println("quants numeros vols posar en l'array ");
        int numero = Integer.parseInt(System.console().readLine());
        int array[] = new int[numero];
        int numero2I = 0;
        int numeroAD = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digues un numero");
            String numero2S = System.console().readLine();
            if (numero2S.equalsIgnoreCase("x")) {
                break;
            }
            numero2I = Integer.parseInt(numero2S);
            array[i] = numero2I;
        }
        for (int y = 0; y < array.length; y++) {
            if (array[y] != 0) {
                System.out.println(" Els numeros quardats a l'array son " + array[y]);
            }
        }
        System.out.println("Digues un numero a cercar si esta en l'array es mostrara la seva posició en l'array, sinò no.");
        numeroAD = Integer.parseInt(System.console().readLine());
        for (int x = 0; x < array.length; x++) {
            if (array[x] == numeroAD) {
                System.out.println("Hi es el numero que has dit si està en l'array i és el " + x );
                break;
            }
        }
    }
}
