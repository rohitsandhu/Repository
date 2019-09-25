public class Exercici1 {
    public static void main(String[] args) {
        String nom;
        String cognom;
        String domini;

        System.out.println("Introdueix el teu nom ");
        nom = ( System.console().readLine());
        System.out.println("Introdueix el teu cognom ");
        cognom = ( System.console().readLine());
        System.out.println("Introdueix el teu domini ");
        domini = ( System.console().readLine());

        System.out.println("La teva adreça de correu és:" + nom + cognom + "@" + domini);

    }
}