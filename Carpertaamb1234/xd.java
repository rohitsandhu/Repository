public class Exercici5 {
    public static void main(String[] args) {
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        int punts=0;

        System.out.println("Quina de les segunets lletres és el resultat de 2+2?");
        System.out.println("a=2");
        System.out.println("b=4");
        System.out.println("c=6");
        System.out.println("d=8");
        resposta1 = ( System.console().readLine());
        if (resposta1.equalsIgnoreCase("b")) {
        System.out.println("correcte" + "tens" + punts + " punts");
        punts++;
            else {
            System.out.println("Incorrecte" + " has obtingut " + punts + " punts" );

            System.out.println("Quina de les segunets lletres és el resultat de 3+3? ");
            System.out.println("a=2");
            System.out.println("b=4");
            System.out.println("c=6");
            System.out.println("d=8");
            resposta2 = ( System.console().readLine());
            if (resposta2.equalsIgnoreCase("c")) {
            System.out.println("correcte" + "tens" + punts + " punts" );
            punts++;
                else {
                System.out.println("Incorrecte" + " has obtingut " + punts + " punts" );

                    System.out.println("Quina de les segunets lletres és el resultat de 4+4? ");
                    System.out.println("a=6");
                    System.out.println("b=8");
                    System.out.println("c=10");
                    System.out.println("d=12");
                    resposta3 = ( System.console().readLine());
                    if (resposta3.equalsIgnoreCase("b")) {
                    System.out.println("correcte" + "tens" + punts + " punts");
                    punts++;
                        else {
                        System.out.println("Incorrecte" + " has obtingut " + punts + " punts" );

                        System.out.println("Quina de les segunets lletres és el resultat de 5+5?");
                        System.out.println("a=10");
                        System.out.println("b=12");
                        System.out.println("c=14");
                        System.out.println("d=16");
                        resposta4 = ( System.console().readLine());
                        if (resposta4.equalsIgnoreCase("a")) {
                        System.out.println("correcte" +"tens" + punts + " punts");
                        punts++;
                        else {
                            System.out.println("Incorrecte" + " has obtingut " + punts + " punts" );
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

                    System.out.println("Incorrecte" + " has obtingut " + punts + " punts" );
    }
}
