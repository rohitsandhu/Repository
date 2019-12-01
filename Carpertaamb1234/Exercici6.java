public class Exercici6{
    public static void main(String[] args){
        String frase;
        long temps_inicial;
        long temps_final;
        

        
        System.out.println("Escriu Setze jutges d'un jutjat mengen fetge en un penjat");
        temps_inicial= System.currentTimeMillis();
        frase= ( System.console().readLine());
       
        while(!frase.equalsIgnoreCase("Setze jutges d'un jutjat mengen fetge en un penjat")) {
            System.out.println("Escriu Setze jutges d'un jutjat mengen fetge en un penjat");
            frase= ( System.console().readLine());
        }
        temps_final= System.currentTimeMillis();

        System.out.println((temps_final - temps_inicial)/1000 + " segons has tardat en escriure la frase correctament");
    }
}