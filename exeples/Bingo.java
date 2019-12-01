import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        int array[][] = new int[3][9];
        Random r = new Random();
        boolean mateix = true;
        int numero = 0;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                mateix = true;
                while (mateix) {
                    numero = r.nextInt(10) + 10 * j;
                    int p = 0; // vegades amb la comprobació correcte
                    for (int y = 0; y < array.length; y++) {
                        if (numero != array[y][j]) {
                            p++;
                        }
                    }
                    if (p == 3) {
                        mateix = false;
                    }
                }
                array[i][j] = numero;
            }
        }
        for (int o = 0; o < 2; o++) {
            for (int j = 0; j < array[0].length; j++) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i][j] > array[i + 1][j]) {
                        int guardar = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = guardar;
                    }
                }
            }
        }
        // introduir zeros
        int arraynor[] = new int[9];
        int contador0 = 0;
        int contador1 = 0;
        int contador2 = 0;
        int iterador = 0;
        int random = 0;

        while (iterador < 9) {
            random = r.nextInt(3);
            if (random == 0 && contador0 < 3) {
                contador0++;
                arraynor[iterador] = random;
                iterador++;
            }
            if (random == 1 && contador1 < 3) {
                contador1++;
                arraynor[iterador] = random;
                iterador++;
            }
            if (random == 2 && contador2 < 3) {
                contador2++;
                arraynor[iterador] = random;
                iterador++;
            }
        }
        for (int i = 0; i < arraynor.length; i++) {
            array[arraynor[i]][i] = 0;
        }
        String arrayy[][] = new String[3][9];
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                arrayy[i][j] = String.valueOf(array[i][j]);
            }
        }
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (arrayy[i][j].equals("0")) {
                    arrayy[i][j] = "x";
                }
            }
        }

        int arraynumeros[] = new int[89];
        int bola = 0;
        int countFila0 = 0;
        int countFila1 = 0;
        int countFila2 = 0;
        boolean fila = false;
        boolean taula = false;

        for (int i = 0; i < arraynumeros.length; i++) {
            boolean repe = true;
            while (repe) {
                bola = r.nextInt(89) + 1;
                repe = false;
                for (int x = 0; x < arraynumeros.length; x++) {
                    if (arraynumeros[x] == bola) {
                        repe = true;
                    }
                }
            }
            arraynumeros[i] = bola;
            System.out.println();
            System.out.println("La bola número " + i + " és el número: " + bola);

            boolean nox = false;

            for (int x = 0; x < array.length; x++) {
                for (int y = 0; y < array[0].length; y++) {
                    if (array[x][y] == bola) {
                        arrayy[x][y] = "x";
                        nox = true;
                        System.out.println("El numero " + bola + " esta en la taula" + " prem enter per tatxar-ho");
                        System.console().readLine();
                        mostraArray(arrayy);
                        System.out.println();
                        System.out.println();
                        if (x == 0) {
                            countFila0++;
                        } else if (x == 1) {
                            countFila1++;
                        } else {
                            countFila2++;
                        }
                    }
                    if (!fila) {
                        if (countFila0 == 6 || countFila1 == 6 || countFila2 == 6) {
                            System.out.println("Premi!!! Han cantat fila");
                            fila = true;
                        }
                    }
                    if (!taula) {
                        if (countFila0 == 6 && countFila1 == 6 && countFila2 == 6) {
                            System.out.println("Premi!!! Has tarxat tot!!!");
                            taula = true;
                            break;
                        }
                    }

                }

            }
            if (taula) {
                break;
            }
            if (!nox) {
                System.out.print("El numero és " + bola + " no està en la taula");
                System.out.println();
                System.console().readLine();
            }

        }

        // for(int i=0;i<arraynumeros.length;i++){
        // System.out.print(arraynumeros[i]+" ");

        // }

        // for (int xd = 0; xd < arraynumeros.length; xd++) {

        // int bola = r.nextInt(89) + 1;
        // bolatreta = false;
        // if (!bolatreta) {
        // for (int j = 0; j < arraynumeros.length; j++) {
        // if (arraynumeros[j] == bola) {
        // bolatreta = true;
        // }
        // }
        // while (bolatreta) {
        // bola = r.nextInt(89) + 1;
        // for (int h = 0; h < arraynumeros.length; h++) {
        // if (arraynumeros[h] == bola) {
        // bolatreta = false;
        // break;
        // }
        // }
        // }
        // if (!bolatreta) {
        // arraynumeros[xd] = bola;
        // for (int j = 0; j < array[0].length; j++) {
        // for (int i = 0; i < array.length; i++) {
        // String bolaString = String.valueOf(arraynumeros[xd]);
        // if (arrayy[i][j].equals(bolaString)) {
        // arrayy[i][j] = "x";
        // bolatreta = true;
        // System.out.println(" La bola " + xd + " és igual a " + arraynumeros[xd]
        // + " i es pot taxar del tauler, prem ENTER per taxar-lo");
        // System.console().readLine();

        // mostraArray(arrayy);
        // System.out.println();

        // }
        // }
        // }
        // if (!bolatreta)
        // System.out.println(
        // " La bola " + xd + " és igual a " + arraynumeros[xd] + " no esta en el
        // bingo");
        // System.console().readLine();

        // }
        // }
        // }

        //
        System.out.println();
    }

    public static void mostraArray(String[][] arrayNums) {
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayNums[0].length; j++) {
                System.out.print(arrayNums[i][j] + "\t");
            }
        }
    }
}