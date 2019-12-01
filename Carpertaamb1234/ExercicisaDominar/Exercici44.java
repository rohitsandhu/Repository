public class Exercici44{
    public static void main(String[] args) {
         char [] arrays = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E' }; 
         System.out.println("escriu els 8 numeros del teu dni i es calcularà la lletra final");

         int numero = Integer.parseInt(System.console().readLine());

         System.out.println("la lletra del DNI és" + arrays[(numero%23)]);
    }
}