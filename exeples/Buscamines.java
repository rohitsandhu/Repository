import java.util.Random;

public class Buscamines {
    public static void main(String[] args) {
        String arraybi[][] = new String[5][5];
        Random r = new Random();
        int mina2 = 0;
        int mina1 = 0;
        int mina3 = 0;
        int contadormina1 = 0;
        int contadormina2 = 0;
        int contadormina3 = 0;
        boolean tresmines = false;
        while (!tresmines) {
            mina1 = r.nextInt(25);
            mina2 = r.nextInt(25);
            mina3 = r.nextInt(25);
            if (mina1 != mina2 && mina1 != mina3 && mina2 != mina3) {
                for (int i = 0; i < arraybi.length; i++) {
                    for (int j = 0; j < arraybi[0].length; j++) {
                        if (contadormina1 == mina1) {
                            arraybi[i][j] = "x";
                        }
                        if (contadormina2 == mina2) {
                            arraybi[i][j] = "x";
                        }
                        if (contadormina3 == mina3) {
                            arraybi[i][j] = "x";
                        }
                        contadormina1++;
                        contadormina2++;
                        contadormina3++;
                        if(contadormina1 == mina1 && contadormina2 == mina2 && contadormina3 == mina3){
                            tresmines=true;
                            break;
                        }
                    }
                }
                if(tresmines=true){ 
                    break;
                }
            }
        }
        mostraArray(arraybi);        // for (int i = 0; i < arraybi.length; i++) {
            // System.out.println();
            // for (int j = 0; j < arraybi[0].length; j++) {
            // System.out.print(arraybi[i][j] + " ");
            // }
            // }
    }

    public static void mostraArray(String[][] arrayX) {
        for (int i = 0; i < arrayX.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayX[0].length; j++) {
                System.out.print(arrayX[i][j] + "\t");
            }

        }
    }
}