import java.util.Random;

public class Activitat4DA {
    public static void main(String[] args) {
        int array[] = new int[5];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(2) + 1;
            System.out.println(array[i]);
        }
    }
}