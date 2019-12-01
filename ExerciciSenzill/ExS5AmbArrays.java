public class ExS5AmbArrays {
    public static void main(String[] args) {
        int x = 0;
        int array[] = new int[1000];
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
        do {
            System.out.println(" Digues un numero ");
            numero = Integer.parseInt(System.console().readLine());
            array[x] = numero;
            x++;
            System.out.println(" Vols afegir més numeros a l'array? (S) o (N)?");
            sino = System.console().readLine();

            if (sino.equalsIgnoreCase("S"))
                ;
            {
                afegir = true;
            }
            if (sino.equalsIgnoreCase("N")) {
                afegir = false;
            }
        } while (afegir);

        for (int u = 0; u < array.length; u++) {
            if (array[u] != 0) {
                if (array[u] % 2 == 0) {
                    sumaparells = array[u] + sumaparells;
                    quantitatParells++;
                }
            }
            if (array[u] != 0) {
                if (array[u] % 2 != 0) {
                    sumaimparells = array[u] + sumaimparells;
                    quantitatImparells++;
                }
            }
            if (array[u] != 0) {
                if (array[u] > 0) {
                    sumapositius = array[u] + sumapositius;
                    quantitatPositius++;
                }
            }
            if (array[u] != 0) {
                if (array[u] < 0) {
                    sumanegatius = array[u] + sumanegatius;
                    quantitatNegatius++;
                }
            }

        }

        System.out.println("La suma dels imparells és " + sumaimparells + " i la quantitat de numeros imparells és de  "
                + quantitatImparells);
        System.out.println("La suma de numeros parells és " + sumaparells + " i la quantitat de numeros parells és de "
                + quantitatParells);
        System.out.println("La suma dels negatius és  " + sumanegatius + " i la qantitat de numeros negatius és "
                + quantitatNegatius);
        System.out.println("La suma dels numeros positius és " + sumapositius
                + " i la quantitat de numeros positius és de " + quantitatPositius);
    }
}