public class Exercici2 {
    public static void main(String[] args) {
        float alçada;
        float pes;
        float imc = 0;
        
        System.out.println("intrudueix la teva alçada en metres:");
        alçada =  Float.parseFloat( System.console().readLine());
        System.out.println("intruduesx el teu pes en Kgs:");
        pes =  Float.parseFloat( System.console().readLine());
        imc = (pes) / (alçada*alçada);
        System.out.println("La teva adreça de correu és:" + imc );

        if (imc <= 18.5) {
        System.out.println("ets massa prim/a tens de menjar més" );    
        }
        else if (imc <= 24.9)  {
        System.out.println("estas bé" ); 
        }
        else if (imc <= 29.9)  {
            System.out.println("tens sobre pes" ); 
            }
        else if (imc >= 30)  {
                System.out.println("el teu pes correspon a obesitat" ); 
        }
    }
}