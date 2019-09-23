public class Test{
    public static void main(String[] args){
        float v1;
        float v2;
        System.out.println("intruduesx el primer num");
        v1 = Float.parseFloat( System.console().readLine());
        System.out.println("intruduesx el segon num");
        v2 = Float.parseFloat( System.console().readLine());
        

        System.out.println("El resultat de la suma es: " + (int) v1 + (int) v2);
        System.out.println("El resultat de la resta es: " + (int) v1 + (int) v2);
        System.out.println("El resultat de la divisio es: " + (v1 / v2));
        System.out.println("El resultat de la multiplicacio es: " + (v1 * v2));
    }
}