public class Exercici66{
    public static void main(String[] args){
       int parcial1;
       int parcial2;
       int parcial3;
       int parcial4;
       int parcial5;
       int final1;

       System.out.println("Digues la nota del examen parcial 1");
       parcial1  = Integer.parseInt( System.console().readLine());
       System.out.println("Digues la nota del examen parcial 2");
       parcial2  = Integer.parseInt( System.console().readLine());
       System.out.println("Digues la nota del examen parcial 3");
       parcial3 = Integer.parseInt( System.console().readLine());
       System.out.println("Digues la nota del examen parcial 4");
       parcial4  = Integer.parseInt( System.console().readLine());
       System.out.println("Digues la nota del examen parcial 5");
       parcial5  = Integer.parseInt( System.console().readLine());
       System.out.println("Digues la nota del examen final");
       final1  = Integer.parseInt( System.console().readLine());

       System.out.println(((((parcial1 + parcial2 + parcial3 + parcial4 + parcial5)/5)*40/100) + (final1*60)/100));
    }
}