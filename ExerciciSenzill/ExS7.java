public class ExS7 {
    public static void main(String[] args) {
        String arrayNOM[] = new String[1000];
        String arrayCOGNOM[] = new String[1000];
        int arraySALARI[] = new int[1000];
        String arrayDNI[] = new String[1000];

        for (int i = 0; i < 1000; i++) {
            System.out.println("Digues un nom");
            String nom = System.console().readLine();
            arrayNOM[i] = nom;

            System.out.println("Digues un cognom");
            String cognom = System.console().readLine();
            arrayCOGNOM[i] = cognom;

            System.out.println("Digues un salari en euros(€)");
            int salari = Integer.parseInt(System.console().readLine());
            arraySALARI[i] = salari;

            System.out.println("Digues un DNI");
            String dni = System.console().readLine();
            if (dni.length() != 8) {
                System.out.println("tornaho a intentar brotha");
                dni = System.console().readLine();
            }
            arrayDNI[i] = dni;

            System.out.println("Prem x si has acabat d'introduir les dades o ENTER per continuar intruduint dades");
            String x = System.console().readLine();
            if (x.equalsIgnoreCase("x")) {
                break;
            }
        }
        System.out.println("Si vols buscar una persona escriu el seu nom a continaució");
        String nomB = System.console().readLine();
        while (!nomB.equalsIgnoreCase("x")) {
            for (int y = 0; y < 1000; y++) {
                if (nomB.equalsIgnoreCase(arrayNOM[y])) {
                    System.out.println("El nom has intrudit està guardat en els nostres arrays " + " Nom: "+ arrayNOM[y] + " Cognom:  "
                            + arrayCOGNOM[y] + " Salari: " + arraySALARI[y]+"€" + " Dni: " + arrayDNI[y]);
                }
            }
            // break;

            System.out.println("Si vols buscar a una altre persona escriu el seu nom a continaució");
            nomB = System.console().readLine();
        }

    }
}