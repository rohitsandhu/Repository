import java.util.Random;

public class Joc2 {
    public static void main(String[] args) {

        Random r = new Random();
        char arrayR[] = new char[9];
        String arrayJugadors[] = new String[2];
        int resultat[]= new int [2];
        System.out.println("Quantes rondes vols que sigui la partida?");
        int rondes = Integer.parseInt(System.console().readLine());
        System.out.println("Digues el teu nom jugador 1");
        arrayJugadors[0] = System.console().readLine();
        System.out.println("Digues el teu nom jugador 2");
        arrayJugadors[1] = System.console().readLine();
        String consonants = "bcçdfghjklmnpqrstvwxyz";
        String vocals = "aeiou";

        int p = 0;
        int arrayposicio[] = new int[9];
        String arrayParaula[][] = new String[2][rondes];
        System.out.println();

        for (int j = 0; j < arrayParaula[0].length; j++) {
            int contadorV = 0;
            int contadorC = 0;
            for (int i = 0; i < arrayposicio.length; i++) {

                p = r.nextInt(2);

                if (p == 0 && contadorV < 4) {
                    arrayposicio[i] = 0;
                    contadorV++;
                   ; // o es pot utilitzar el vocals.lenght() en lloc de posar 5
                } else if (p == 1 && contadorC < 5) {
                    arrayposicio[i] = 1;
                    contadorC++;
                    arrayR[i] = consonants.charAt(r.nextInt(22)); // o es pot utilitzar el consonants.lenght() en lloc
                                                                  // de
                                                                  // posar 22
                } else {
                    i--;
                }
            }
            for (int i = 0; i < arrayParaula.length; i++) {
                System.out.println("");
                for (int l = 0; l < arrayR.length; l++) {
                    char low = arrayR[l];
                    arrayR[l] = Character.toLowerCase(low);
                    System.out.print(arrayR[l] + " ");
                }
                System.out.println("");
                System.out.println("Fes una paraula amb el taullel mostrat anteriorment jugador " + arrayJugadors[i]);
                String resposta = System.console().readLine();
                resultat[i]=resposta.length() + resultat[i];
                arrayParaula[i][j] = resposta;
                bucle: for (int x = 0; x < resposta.length(); x++) {
                    char comprovacio = resposta.charAt(x);

                    for (int y = 0; y < arrayR.length; y++) {
                        if (comprovacio == arrayR[y]) {
                            arrayR[y] = Character.toUpperCase(comprovacio);
                            System.out.println("Correcte");
                            break bucle;
                        }
                        if (y == 8) {
                            System.out.println("La paraula " + comprovacio + " no està en l'array!");
                            resultat[i]= resultat[i] - resposta.length();
                            System.out.println("Nope");
                            break bucle;
                        }
                    }
                    if (x == resposta.length()) {
                        resultat[i]= resultat[i] - resposta.length();
                        System.out.println("nope");
                    }
                }
            }
        }
        System.out.println("El resultat de " + arrayJugadors[0] + " és "+ resultat[0]);
        System.out.println("El resultat de " + arrayJugadors[1] + " és "+ resultat[1]);
    }
}