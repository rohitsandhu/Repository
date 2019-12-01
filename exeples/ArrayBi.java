import java.util.Random;

public class ArrayBi{
    public static void main(String [] args){
        Random r = new Random();

        int array[][] = new int[3][10];
        int i,j;
        for(i=0; i < array.length; i++){
            System.out.print("\n");
            for(j=0; j < array[0].length; j++){
                array[i][j] = (r.nextInt(99)+10);
                System.out.print(array[i][j] + "  ");

            }

        }
    }
}