public class Exercici3{
    public static void main(String[] args) {
        String nom;
        String sexe;
        int edat;
        System.out.println("Introdueix el teu nom ");
        nom = ( System.console().readLine());
        System.out.println("Introdueix el teu sexe (home o dona)");
        sexe = ( System.console().readLine());
        System.out.println("Introdueix la teva edat");
        edat = Integer.parseInt( System.console().readLine());
        
        if ( sexe.equals("home") && edat < 16 ) {
            System.out.println(nom + " la teva categoria és Juvenil masculí" );    
        }
        else if ( sexe.equals("home") &&  edat >=16 &&  edat <=65 ){ 
            System.out.println( nom + " la teva categoria és Sènior masculí" );
    }
        else if ( sexe.equals("home") &&  edat > 65 ) {
            System.out.println( nom + " la teva categoria és Veterà masculí" );
        } 
        else if ( sexe.equals("dona") && edat < 16 ) {
            System.out.println(nom + " la teva categoria és Juvenil femení" );    
        }
        else if ( sexe.equals("dona") &&  edat >=16 &&  edat <=65 ){ 
            System.out.println( nom + " la teva categoria és Sènior femení" );
    }
        else if ( sexe.equals("dona") &&  edat > 65 ) {
            System.out.println( nom + " la teva categoria és Veterà femení" );
        } 
    }
}
