package app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        boolean tot1 = false;
        String arraybi[][] = new String[7][20];
        int arrayEdat[] = new int[20];
        for (int i = 0; i < arraybi.length; i++) {
            for (int j = 0; j < arraybi[0].length; j++) {
                arraybi[i][j] = "";
            }
        }
        int columnes = 0;
        todo: while (!tot1) {
            System.out.println(
                    "Escriu (1) si vols crear un usuari nou o (2) si vols fer login o (3) si vols sortir o (4) BUSCADOR o (5) per ordenar");
            int opció = Integer.parseInt(System.console().readLine());
            switch (opció) {
            case 1:
                System.out.println("Has triat crear un usuari nou");

                System.out.println("Digues el teu nom");
                arraybi[0][columnes] = System.console().readLine();

                System.out.println("Digues el teu cognom");
                arraybi[1][columnes] = System.console().readLine();

                System.out.println("Digues la teva adreça");
                arraybi[2][columnes] = System.console().readLine();

                System.out.println("Digues la teva població");
                arraybi[3][columnes] = System.console().readLine();

                System.out.println("Digues la teva data de neixament(dd/MM/yyyy)");
                arraybi[4][columnes] = System.console().readLine();
                String dataneixament[] = arraybi[4][columnes].split("/");

                Date data = new Date();
                SimpleDateFormat hola = new SimpleDateFormat("dd/MM/yyyy");
                String dataAvui[] = hola.format(data).split("/");

                int edat = 0;
                edat = Integer.parseInt(dataAvui[2]) - Integer.parseInt(dataneixament[2]);
                arrayEdat[columnes] = edat;
                if (Integer.parseInt(dataneixament[1]) > Integer.parseInt(dataAvui[1])) {
                    edat = edat - 1;
                    arrayEdat[columnes] = edat;
                }
                if (Integer.parseInt(dataneixament[1]) == Integer.parseInt(dataAvui[1])) {
                    if (Integer.parseInt(dataneixament[0]) > Integer.parseInt(dataAvui[0])) {
                        edat = edat - 1;
                        arrayEdat[columnes] = edat;
                    }
                }

                boolean repe = false;
                while (!repe) {
                    repe = true;
                    System.out.println("Digues el nom d'usuari");
                    String nomuser = System.console().readLine();
                    for (int x = 0; x < arraybi[0].length; x++) {
                        if (nomuser.equals(arraybi[5][x])) {
                            repe = false;
                        }
                    }
                    if (repe) {
                        arraybi[5][columnes] = nomuser;
                    }
                }
                boolean repe2 = false;
                while (!repe2) {
                    repe2 = true;
                    System.out.println("Digues una contrasenya que compleixi els seguents requisits");
                    String contra = System.console().readLine();

                    if (contra.matches("(?=.*[A-Z])(?=.*[a-z]).{8,}")) {
                        arraybi[6][columnes] = contra;
                    } else {
                        repe2 = false;
                    }
                }
                columnes++;
                break;
            case 2:

                while (true) {
                    System.out.println("Has triat fer login");
                    System.out.println("");
                    System.out.println("Digues un usuari al qual vols logejar");
                    String log = System.console().readLine();
                    System.out.println("Digues la contrasenya del usuari");
                    String contra = System.console().readLine();
                    boolean logok = false;

                    for (int x = 0; x < arraybi[0].length; x++) {

                        if (log.equals(arraybi[5][x]) && contra.equals(arraybi[6][x])) {
                            System.out.println("-------------------------------------------------------");
                            System.out.println(arraybi[0][x]);
                            System.out.println(arraybi[1][x]);
                            System.out.println(arraybi[2][x]);
                            System.out.println(arraybi[3][x]);
                            System.out.println(arraybi[4][x] + " L'edat que té ara és " + arrayEdat[x]);
                            System.out.println(arraybi[5][x]);
                            System.out.println("-------------------------------------------------------");
                            logok = true;
                        }
                    }
                    if (logok = false) {
                        System.out.println("El usuari o la contrasenya son incorrectes");
                    }
                    break;
                }
                break;
            case 3:
                System.out.println("Has triat sortir bye, bye accs");
                break todo;

            case 4:
                System.out.println("És un cercador");
                String patro = System.console().readLine();
                Pattern patroB = Pattern.compile(patro);
                for (int j = 0; j < arraybi[0].length; j++) {
                    for (int i = 0; i < arraybi.length; i++) {

                        Matcher mm = patroB.matcher(arraybi[i][j]);
                        if (mm.find()) {
                            System.out.println("");
                            for (int x = 0; x < arraybi.length; x++) {
                                System.out.println(arraybi[x][j]);
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                int num = 0;
                String arraybi2[][] = new String[7][1];
                System.out.println(
                        " Escriu (A) per ordenar-ho de forma accendent o escriu (D) per ordenar-ho de forma deccendent: ");
                String re = System.console().readLine();
                if (re.equalsIgnoreCase("A")) {

                    for (int i = 0; i < arrayEdat.length; i++) {
                        for (int j = 1; j < (arrayEdat.length - 1); j++) {
                            if (arrayEdat[j - 1] > arrayEdat[j]) {

                                num = arrayEdat[j - 1];
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi2[x][0] = arraybi[x][j - 1];
                                }

                                arrayEdat[j - 1] = arrayEdat[j];
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi[x][j - 1] = arraybi[x][j];
                                }

                                arrayEdat[j] = num;
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi[x][j] = arraybi2[x][0];
                                }
                            }
                        }
                    }
                    for (int i = 0; i < arrayEdat.length; i++) {
                        if (arrayEdat[i] == 0) {
                        } else {
                            System.out.println("-------------------------------------------------------");
                            System.out.println(" Nom:  " + arraybi[0][i]);
                            System.out.println(" Cognom: " + arraybi[1][i]);
                            System.out.println(" Població " + arraybi[3][i]);
                            System.out.println(" Edat: " + arrayEdat[i]);
                            System.out.println("-------------------------------------------------------");
                        }
                    }
                } else if (re.equalsIgnoreCase("D")) {
                    for (int i = 0; i < arraybi.length; i++) {
                        for (int j = 1; j < arraybi.length; j++) {
                            if (arrayEdat[i] > arrayEdat[j]) {

                                num = arrayEdat[i];
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi2[x][0] = arraybi[x][i];
                                }

                                arrayEdat[i] = arrayEdat[j];
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi[x][i] = arraybi[x][j];
                                }
                                arrayEdat[j] = num;
                                for (int x = 0; x < arraybi.length; x++) {
                                    arraybi[x][j] = arraybi2[x][0];
                                }
                            }
                        }
                    }

                    for (int i = 0; i < arrayEdat.length; i++) {
                        if (arrayEdat[i] == 0) {
                        } else {
                            System.out.println("-------------------------------------------------------");
                            System.out.println(" Nom:  " + arraybi[0][i]);
                            System.out.println(" Cognom: " + arraybi[1][i]);
                            System.out.println(" Població " + arraybi[3][i]);
                            System.out.println(" Edat: " + arrayEdat[i]);
                            System.out.println("-------------------------------------------------------");
                        }

                    }
                }
            }
        }
    }
}