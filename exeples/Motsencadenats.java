import java.lang.reflect.Array;

public class Motsencadenats {
    public static void main(String[] args) {

        System.out.println("Quantes rondes vols jugar?");
        int rondes = Integer.parseInt(System.console().readLine());

        String arrayParaules[][] = new String[2][rondes];

        String arrayNom[] = new String[2];

        System.out.println("Digues el teu nom jugador 1");
        arrayNom[0] = System.console().readLine();
        System.out.println("Digues el teu nom jugador 2");
        arrayNom[1] = System.console().readLine();

        System.out.println("Digues amb la paraula amb la que vols començar a jugar");
        String paraula = System.console().readLine();
        int resultat1 = 0;
        int resultat2 = 0;
        // for (int i = 0; i < arrayParaules.length; i++) {
        // for (int j = 0; j < arrayParaules[0].length; j++) {
        // arrayParaules[i][j] = "";
        // }
        // }
        bucle: for (int j = 0; j < arrayParaules[0].length; j++) {

            for (int i = 0; i < arrayParaules.length; i++) {
                System.out.println("Digues una paraula que començi per " + paraula.substring(paraula.length() - 2)
                        + "  " + arrayNom[i]);
                String resposta = System.console().readLine();

                if (resposta.substring(0, 2).equals(paraula.substring(paraula.length() - 2))) { // també es pot fer
                                                                                                // servir
                                                                                                // "paraula.startsWith(paraula.substring(paraula.length()
                                                                                                // - 2)" per
                                                                                                // "resposta.substring(0,
                                                                                                // 2)resposta.substring(0,
                                                                                                // 2).equals(paraula.substring(paraula.length()
                                                                                                // - 2)"
                    System.out.println("Correcte");
                    if (i == 0) {
                        resultat1++;
                    }
                    if (i == 1) {
                        resultat2++;
                    }
                } else {
                    System.out.println("Incorrecte");
                    break bucle;
                }

                paraula = resposta;

            }
        }

        System.out.println("Resultat jugador1 " + resultat1);
        System.out.println("Resultat jugador2 " + resultat2);
    }
}