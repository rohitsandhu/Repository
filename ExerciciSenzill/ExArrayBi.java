import java.lang.reflect.Array;
import java.util.Random;

public class ExArrayBi{
    public static void main(String[] args) {
        Random r = new Random();
        int [][] arrayBi=new int[2][10];
        int [] arrayUni=new int[10];

        for(int i=0; i<arrayBi.length; i++){

            for(int j=0; j < arrayBi[0].length;j++){
                arrayBi[i][j]=r.nextInt(10);
            }
        }
            for(int j=0; j < arrayBi[0].length;j++){
                arrayUni[j]=arrayBi[0][j] + arrayBi[1][j];
        }
        System.out.println();
    }
}

