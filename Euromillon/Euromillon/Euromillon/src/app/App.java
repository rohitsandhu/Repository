package app;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(" De quina forma triar els numeros? ");
        System.out.println(" Prem 1 per tal de fer-ho manualment ");
        System.out.println(" Prem 2 per tal de generar els numeros automaticament ");
        int opció = Integer.parseInt(System.console().readLine());
        int arrayB[] = new int[5];
        int arrayB2[] = new int[2];
        int arrayR[] = new int[5];
        int arrayR2[] = new int[2];

        Random r = new Random();
        switch (opció) {
        case 1:

            // triar els numeros de forma manual
            System.out.println(" Has triat l'opció MANUALMENT a contianució tindras de triar 5 numeros de 1 a 50 ");

            for (int i = 0; i < arrayB.length; i++) {
                System.out.println("Tria la bola numero: " + (i + 1));
                boolean repetit = false;
                while (!repetit) {
                    int CRepetit = 0;
                    int num = Integer.parseInt(System.console().readLine());
                    for (int x = 0; x < arrayB.length; x++) {
                        if (num != arrayB[x]) {
                            repetit = false;
                            CRepetit++;
                        }
                    }
                    if (CRepetit == 5) {
                        arrayB[i] = num;
                        repetit = true;
                    } else {
                        System.out.println(" El numero esta repetit torna a escriure un numero ");
                    }
                }

            }
            System.out.println(" Ara tens de triar 2 numeros del 1 al 10 ");

            for (int i = 0; i < arrayB2.length; i++) {
                System.out.println("Tria la bola numero: " + (i + 1));
                boolean repetit = false;
                while (!repetit) {
                    int CRepetit = 0;
                    int num = Integer.parseInt(System.console().readLine());
                    for (int x = 0; x < arrayB2.length; x++) {
                        if (num != arrayB2[x]) {
                            repetit = false;
                            CRepetit++;
                        }
                    }
                    if (CRepetit == 2) {
                        arrayB2[i] = num;
                        repetit = true;
                    } else {
                        System.out.println(" El numero esta repetit torna a escriure un numero ");
                    }
                }
            }
            for (int l = 0; l < arrayB.length; l++) {
                System.out.print("-" + arrayB[l] + "-");
            }
            System.out.println("");
            for (int l = 0; l < arrayB2.length; l++) {
                System.out.print("-" + arrayB[l] + "-");
            }
            System.out.println("");

            int intents = 0;
            re: while (true) {
                // creació del numeros guanyador
                for (int j = 0; j < arrayR.length; j++) {
                    boolean repetit = false;
                    while (!repetit) {
                        int CRepetit = 0;
                        int num = r.nextInt(50) + 1;
                        for (int i = 0; i < arrayR.length; i++) {
                            if (num != arrayR[i]) {
                                repetit = false;
                                CRepetit++;
                            }
                        }
                        if (CRepetit == 5) {
                            arrayR[j] = num;
                            repetit = true;
                        }
                    }

                    for (int i = 0; i < arrayR2.length; i++) {
                        repetit = false;
                        while (!repetit) {
                            int CRepetit = 0;
                            int num = r.nextInt(10) + 1;
                            for (int x = 0; x < arrayR2.length; x++) {
                                if (num != arrayR2[x]) {
                                    repetit = false;
                                    CRepetit++;
                                }
                            }
                            if (CRepetit == 2) {
                                arrayR2[i] = num;
                                repetit = true;
                            }
                        }
                    }

                }
                int ContadorResultat = 0;
                int ContadorResultat2 = 0;
                // comprovació amb el numero guanyador
                for (int i = 0; i < arrayB.length; i++) {
                    for (int y = 0; y < arrayB.length; y++) {

                        if (arrayB[i] == arrayR[y]) {
                            ContadorResultat++;
                        }
                    }
                }
                for (int x = 0; x < arrayB2.length; x++) {
                    for (int j = 0; j < arrayB2.length; j++) {
                        if (arrayB2[x] == arrayR2[j]) {
                            ContadorResultat2++;
                        }
                    }

                }
                if (ContadorResultat2 == 2 && ContadorResultat == 5) {
                    System.out.println(arrayR[0] + ", " + arrayR[1] + ", " + arrayR[2] + ", " + arrayR[3] + ", "
                            + arrayR[4] + "i de numero estrella: " + arrayR2[0] + ", " + arrayR2[1]
                            + " Correcte!!!  Primer premi !!" + "(" + intents + ") intents");
                    break re;
                }

                intents++;
            }
            break;
        case 2:

            // creació del numeros aleatoriatoriament
            for (int j = 0; j < arrayB.length; j++) {
                boolean repetit = false;
                while (!repetit) {
                    int CRepetit = 0;
                    int num = r.nextInt(50) + 1;
                    for (int i = 0; i < arrayB.length; i++) {
                        if (num != arrayB[i]) {
                            repetit = false;
                            CRepetit++;
                        }
                    }
                    if (CRepetit == 5) {
                        arrayB[j] = num;
                        repetit = true;
                    }
                }

                for (int i = 0; i < arrayB2.length; i++) {
                    repetit = false;
                    while (!repetit) {
                        int CRepetit = 0;
                        int num = r.nextInt(10) + 1;
                        for (int x = 0; x < arrayB2.length; x++) {
                            if (num != arrayB2[x]) {
                                repetit = false;
                                CRepetit++;
                            }
                        }
                        if (CRepetit == 2) {
                            arrayB2[i] = num;
                            repetit = true;
                        }
                    }

                }
            }
            System.out.println(
                    "Has triat fer-ho automaticament els següents son els numeros que s'han generat automaticament: ");
            for (int l = 0; l < arrayB.length; l++) {
                System.out.print("-" + arrayB[l] + "-");
            }
            System.out.println("");
            for (int l = 0; l < arrayB2.length; l++) {
                System.out.print("-" + arrayB2[l] + "-");
            }
            System.out.println("");
            // creació del numeros guanyadors + conprovació.

            intents = 0;
            re: while (true) {
                // creació del numeros guanyador
                for (int j = 0; j < arrayR.length; j++) {
                    boolean repetit = false;
                    while (!repetit) {
                        int CRepetit = 0;
                        int num = r.nextInt(50) + 1;
                        for (int i = 0; i < arrayR.length; i++) {
                            if (num != arrayR[i]) {
                                repetit = false;
                                CRepetit++;
                            }
                        }
                        if (CRepetit == 5) {
                            arrayR[j] = num;
                            repetit = true;
                        }
                    }

                    for (int i = 0; i < arrayR2.length; i++) {
                        repetit = false;
                        while (!repetit) {
                            int CRepetit = 0;
                            int num = r.nextInt(10) + 1;
                            for (int x = 0; x < arrayR2.length; x++) {
                                if (num != arrayR2[x]) {
                                    repetit = false;
                                    CRepetit++;
                                }
                            }
                            if (CRepetit == 2) {
                                arrayR2[i] = num;
                                repetit = true;
                            }
                        }
                    }

                }
                int ContadorResultat = 0;
                int ContadorResultat2 = 0;
                // comprovació amb el numero guanyador
                for (int i = 0; i < arrayB.length; i++) {
                    for (int y = 0; y < arrayB.length; y++) {

                        if (arrayB[i] == arrayR[y]) {
                            ContadorResultat++;
                        }
                    }
                }
                for (int x = 0; x < arrayB2.length; x++) {
                    for (int j = 0; j < arrayB2.length; j++) {
                        if (arrayB2[x] == arrayR2[j]) {
                            ContadorResultat2++;
                        }
                    }

                }
                if (ContadorResultat2 == 2 && ContadorResultat == 5) {
                    System.out.println(arrayR[0] + ", " + arrayR[1] + ", " + arrayR[2] + ", " + arrayR[3] + ", "
                            + arrayR[4] + "i de numero estrella: " + arrayR2[0] + ", " + arrayR2[1]
                            + " Correcte!!!  Primer premi !!" + "(" + intents + ") intents");
                    break re;
                }

                intents++;
            }
        }
    }
}