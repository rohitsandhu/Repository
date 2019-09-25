public class Exercici4{
    public static void main(String[] args) {
        String article;
        Float preu;
        Float descompte;
        
        System.out.println("Introdueix el article ");
        article = ( System.console().readLine());
        
        System.out.println("Introdueix el preu de l'article");
        preu = Float.parseFloat( System.console().readLine());
        
        System.out.println("Introdueix el decompte que li vols fer al producte ");
        descompte = Float.parseFloat( System.console().readLine());

        System.out.println("El preu final del" + article +  " és " + (preu - (descompte * preu) /100) + "€"  );
    }
}